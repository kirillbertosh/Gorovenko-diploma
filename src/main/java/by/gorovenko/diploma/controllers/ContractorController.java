package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.Contractor;
import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.repositories.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/contractors")
public class ContractorController {

    @Autowired
    private ContractorRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody Contractor contractor) {
        return new ResponseEntity<>(repository.save(contractor), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Contractor contractor) {
        Optional<Contractor> contractor1 = repository.findById(id);
        repository.delete(contractor1.get());
        repository.save(contractor);
        return new ResponseEntity<>(contractor, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<Contractor> contractor = repository.findById(id);
        repository.delete(contractor.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
