package by.gorovenko.diploma.controllers.reports;

import by.gorovenko.diploma.model.reports.ProductBalanceReport;
import by.gorovenko.diploma.repositories.reports.ProductBalanceReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productBalanceReport")
public class ProductBalanceReportController {

    @Autowired
    private ProductBalanceReportRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody ProductBalanceReport report) {
        return new ResponseEntity<>(repository.save(report), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody ProductBalanceReport report) {
        Optional<ProductBalanceReport> report1 = repository.findById(id);
        repository.delete(report1.get());
        repository.save(report);
        return new ResponseEntity<>(report, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<ProductBalanceReport> report = repository.findById(id);
        repository.delete(report.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
