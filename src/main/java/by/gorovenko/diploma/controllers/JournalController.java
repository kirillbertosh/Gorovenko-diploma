package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.journals.CommonJournal;
import by.gorovenko.diploma.repositories.journals.CommonJournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/document/journal")
public class JournalController {

    @Autowired
    private CommonJournalRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody CommonJournal journal) {
        return new ResponseEntity<>(repository.save(journal), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody CommonJournal journal) {
        Optional<CommonJournal> journal1 = repository.findById(id);
        repository.delete(journal1.get());
        repository.save(journal);
        return new ResponseEntity<>(journal, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<CommonJournal> journal = repository.findById(id);
        repository.delete(journal.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
