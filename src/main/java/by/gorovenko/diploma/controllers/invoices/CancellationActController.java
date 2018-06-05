package by.gorovenko.diploma.controllers.invoices;

import by.gorovenko.diploma.model.invoices.CancellationAct;
import by.gorovenko.diploma.repositories.invoices.CancellationActRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cancellationActs")
public class CancellationActController {

    @Autowired
    private CancellationActRepository repository;

    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody CancellationAct act) {
        return new ResponseEntity<>(repository.save(act), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody CancellationAct act) {
        Optional<CancellationAct> act1 = repository.findById(id);
        repository.delete(act1.get());
        repository.save(act);
        return new ResponseEntity<>(act, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<CancellationAct> act = repository.findById(id);
        repository.delete(act.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
