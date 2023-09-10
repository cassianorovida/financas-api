package br.com.rovidasoft.financasapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    @OneToMany(mappedBy = "category")
    private List<FinancialRelease> financialReleaseList = new ArrayList<>();
}
