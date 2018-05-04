package by.gorovenko.diploma.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document/journal")
public class JournalController {

    @GetMapping(value = "/arrival")
    public ResponseEntity<?> getFullArrivalJournal() {
        return null;
    }

    @GetMapping(value = "/consumption")
    public ResponseEntity<?> getFullConsumptionJournal() {
        return null;
    }

    @GetMapping(value = "/common")
    public ResponseEntity<?> getCommonJournal() {
        return null;
    }
}
