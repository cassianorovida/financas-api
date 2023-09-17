package br.com.rovidasoft.financasapi.controllers;

import br.com.rovidasoft.financasapi.entities.Category;
import br.com.rovidasoft.financasapi.entities.FinancialRelease;
import br.com.rovidasoft.financasapi.services.FinancialReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/financial-release")
public class FinancialReleaseController {

    FinancialReleaseService financialReleaseService;

    @Autowired
    public FinancialReleaseController(FinancialReleaseService financialReleaseService) {
        this.financialReleaseService = financialReleaseService;
    }

    @GetMapping
    public ResponseEntity<List<FinancialRelease>> findAll() {
        return ResponseEntity.ok().body(financialReleaseService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinancialRelease> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(financialReleaseService.findById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<FinancialRelease> add(@RequestBody FinancialRelease financialRelease) {
        return ResponseEntity.ok().body(financialReleaseService.add(financialRelease));
    }

    public void delete(@PathVariable Long id) {
        financialReleaseService.delete(id);
    }

}
