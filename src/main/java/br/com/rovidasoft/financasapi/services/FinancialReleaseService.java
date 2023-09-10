package br.com.rovidasoft.financasapi.services;

import br.com.rovidasoft.financasapi.entities.FinancialRelease;
import br.com.rovidasoft.financasapi.repositories.FinancialReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
