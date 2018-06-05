package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.Measure;
import by.gorovenko.diploma.repositories.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/measures")
public class MeasureController {

    @Autowired
    private MeasureRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody Measure measure) {
        return new ResponseEntity<>(repository.save(measure), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Measure measure) {
        Optional<Measure> measure1 = repository.findById(id);
        repository.delete(measure1.get());
        repository.save(measure);
        return new ResponseEntity<>(measure, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<Measure> measure = repository.findById(id);
        repository.delete(measure.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
