package br.com.rovidasoft.financasapi.repositories;

import br.com.rovidasoft.financasapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
