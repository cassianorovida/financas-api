package br.com.rovidasoft.financasapi.repositories;

import br.com.rovidasoft.financasapi.entities.FinancialRelease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialReleaseRepository extends JpaRepository<FinancialRelease,Long> {
}
