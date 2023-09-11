package br.com.rovidasoft.financasapi.services;

import br.com.rovidasoft.financasapi.entities.FinancialRelease;
import br.com.rovidasoft.financasapi.repositories.FinancialReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
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
}
