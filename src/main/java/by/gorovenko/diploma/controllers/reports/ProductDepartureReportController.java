package by.gorovenko.diploma.controllers.reports;

import by.gorovenko.diploma.model.reports.ProductDepartureReport;
import by.gorovenko.diploma.repositories.reports.ProductDepartureReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productDepartureReport")
public class ProductDepartureReportController {

    @Autowired
    private ProductDepartureReportRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody ProductDepartureReport report) {
        return new ResponseEntity<>(repository.save(report), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody ProductDepartureReport report) {
        Optional<ProductDepartureReport> report1 = repository.findById(id);
        repository.delete(report1.get());
        repository.save(report);
        return new ResponseEntity<>(report, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<ProductDepartureReport> report = repository.findById(id);
        repository.delete(report.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
