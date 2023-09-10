package br.com.rovidasoft.financasapi.controllers;

import br.com.rovidasoft.financasapi.entities.FinancialRelease;
import br.com.rovidasoft.financasapi.services.FinancialReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/financial-release")
public class FinancialReleaseController {

    FinancialReleaseService financialReleaseService;

   @Autowired
    public FinancialReleaseController(FinancialReleaseService financialReleaseService) {
        this.financialReleaseService = financialReleaseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<FinancialRelease>> findAll(){
        return ResponseEntity.ok().body(financialReleaseService.findAll());
    }


}
