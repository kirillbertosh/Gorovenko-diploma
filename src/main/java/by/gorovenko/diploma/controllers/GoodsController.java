package by.gorovenko.diploma.controllers;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.reports.ExpenditureDynamicReport;
import by.gorovenko.diploma.repositories.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsRepository repository;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity save(@RequestBody Goods goods) {
        return new ResponseEntity<>(repository.save(goods), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Goods goods) {
        Optional<Goods> goods1 = repository.findById(id);
        repository.delete(goods1.get());
        repository.save(goods);
        return new ResponseEntity<>(goods, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<Goods> goods = repository.findById(id);
        repository.delete(goods.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
