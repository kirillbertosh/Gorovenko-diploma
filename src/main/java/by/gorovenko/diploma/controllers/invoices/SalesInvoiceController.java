package by.gorovenko.diploma.controllers.invoices;

import by.gorovenko.diploma.model.invoices.SalesInvoice;
import by.gorovenko.diploma.repositories.invoices.SalesInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/salesInvoices")
public class SalesInvoiceController {

    @Autowired
    private SalesInvoiceRepository repository;

    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody SalesInvoice invoice) {
        return new ResponseEntity<>(repository.save(invoice), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody SalesInvoice invoice) {
        Optional<SalesInvoice> invoice1 = repository.findById(id);
        repository.delete(invoice1.get());
        repository.save(invoice);
        return new ResponseEntity<>(invoice, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<SalesInvoice> invoice = repository.findById(id);
        repository.delete(invoice.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
