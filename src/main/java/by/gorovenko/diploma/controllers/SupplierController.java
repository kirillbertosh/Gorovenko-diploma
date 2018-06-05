package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import by.gorovenko.diploma.repositories.SupplierRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody Supplier supplier) {
        return new ResponseEntity<>(repository.save(supplier), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Supplier supplier) {
        Optional<Supplier> supplier1 = repository.findById(id);
        repository.delete(supplier1.get());
        repository.save(supplier);
        return new ResponseEntity<>(supplier, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<Supplier> supplier = repository.findById(id);
        repository.delete(supplier.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
