package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.journals.ArrivalJournal;
import by.gorovenko.diploma.model.journals.CommonJournal;
import by.gorovenko.diploma.model.journals.ConsumptionJournal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document/journal")
public class JournalController {

    @GetMapping(value = "/arrival")
    public ResponseEntity<ArrivalJournal> getFullArrivalJournal() {
        return null;
    }

    @GetMapping(value = "/consumption")
    public ResponseEntity<ConsumptionJournal> getFullConsumptionJournal() {
        return null;
    }

    @GetMapping(value = "/common")
    public ResponseEntity<CommonJournal> getCommonJournal() {
        return null;
    }
}
