package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.exceptions.AppException;
import by.gorovenko.diploma.model.Role;
import by.gorovenko.diploma.model.RoleName;
import by.gorovenko.diploma.model.User;
import by.gorovenko.diploma.payload.ApiResponse;
import by.gorovenko.diploma.payload.JwtAuthenticationResponse;
import by.gorovenko.diploma.payload.LoginRequest;
import by.gorovenko.diploma.payload.SignUpRequest;
import by.gorovenko.diploma.repositories.RoleRepository;
import by.gorovenko.diploma.repositories.UserRepository;
import by.gorovenko.diploma.security.JwtTokenProvider;
import by.gorovenko.diploma.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getLoginOrEmail(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        if(userRepository.existsByLogin(signUpRequest.getLogin())) {
            return new ResponseEntity<>(new ApiResponse(false, "Login is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<>(new ApiResponse(false, "Email Address already in use!"),
                    HttpStatus.BAD_REQUEST);
        }

        if (signUpRequest.getPassword().length() < 8) {
            return new ResponseEntity<>(new ApiResponse(false,
                    "Passwords should contain minimum 8 chars"),
                    HttpStatus.BAD_REQUEST);
        }

        if (!Validator.checkPasswordForNumbersAndLetters(signUpRequest.getPassword())) {
            return new ResponseEntity<>(new ApiResponse(false,
                    "Password should contain letters and numbers"),
                    HttpStatus.BAD_REQUEST);
        }

        if (!Validator.password(signUpRequest.getPassword())) {
            return new ResponseEntity<>(new ApiResponse(false, "Password is incorrect"),
                    HttpStatus.BAD_REQUEST);
        }

        User user = new User(signUpRequest.getFirstName(), signUpRequest.getLastName(), signUpRequest.getLogin(),
                signUpRequest.getEmail(), signUpRequest.getPassword());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                .orElseThrow(() -> new AppException("User Role not set."));

        user.setRoles(Collections.singleton(userRole));

        User result = userRepository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/users/{username}")
                .buildAndExpand(result.getLogin()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
    }
}
