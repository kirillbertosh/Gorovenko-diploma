package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.ProductGroup;
import by.gorovenko.diploma.repositories.ProductGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productGroups")
public class ProductGroupController {

    @Autowired
    private ProductGroupRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody ProductGroup productGroup) {
        return new ResponseEntity<>(repository.save(productGroup), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody ProductGroup productGroup) {
        Optional<ProductGroup> productGroup1 = repository.findById(id);
        repository.delete(productGroup1.get());
        repository.save(productGroup);
        return new ResponseEntity<>(productGroup, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<ProductGroup> productGroup = repository.findById(id);
        repository.delete(productGroup.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
