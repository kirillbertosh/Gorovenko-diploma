package by.gorovenko.diploma.controllers.invoices;

import by.gorovenko.diploma.model.invoices.ComingInvoice;
import by.gorovenko.diploma.repositories.invoices.ComingInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/comingInvoices")
public class ComingInvoiceController {

    @Autowired
    private ComingInvoiceRepository repository;

    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody ComingInvoice invoice) {
        return new ResponseEntity<>(repository.save(invoice), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody ComingInvoice invoice) {
        Optional<ComingInvoice> invoice1 = repository.findById(id);
        repository.delete(invoice1.get());
        repository.save(invoice);
        return new ResponseEntity<>(invoice, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<ComingInvoice> invoice = repository.findById(id);
        repository.delete(invoice.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
