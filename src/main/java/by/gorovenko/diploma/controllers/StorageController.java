package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.Storage;
import by.gorovenko.diploma.repositories.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/storages")
public class StorageController {

    @Autowired
    private StorageRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody Storage storage) {
        return new ResponseEntity<>(repository.save(storage), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Storage storage) {
        Optional<Storage> storage1 = repository.findById(id);
        repository.delete(storage1.get());
        repository.save(storage);
        return new ResponseEntity<>(storage, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<Storage> storage = repository.findById(id);
        repository.delete(storage.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
