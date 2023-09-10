package br.com.rovidasoft.financasapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
public class FinancialRelease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instant date;
    @ManyToOne()
    private Category category;
    private String description;
    private BigDecimal value;
}
