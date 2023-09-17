package br.com.rovidasoft.financasapi.services;

import br.com.rovidasoft.financasapi.entities.FinancialRelease;
import br.com.rovidasoft.financasapi.repositories.FinancialReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancialReleaseService {

    FinancialReleaseRepository financialReleaseRepository;

    @Autowired
    public FinancialReleaseService(FinancialReleaseRepository financialReleaseRepository) {
        this.financialReleaseRepository = financialReleaseRepository;
    }

    public List<FinancialRelease> findAll(){
         return financialReleaseRepository.findAll();
    }

    public FinancialRelease findById(Long id) {
        Optional<FinancialRelease> financialRelease = financialReleaseRepository.findById(id);
        return financialRelease.get();
    }

    public FinancialRelease add(FinancialRelease financialRelease){
      return financialReleaseRepository.save(financialRelease);
    }

    public void delete(Long id){
        financialReleaseRepository.deleteById(id);
    }



}
