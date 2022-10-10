package io.tasks.tax.services;

import io.tasks.tax.models.TaxRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRateRepository extends JpaRepository<TaxRate, Long> {
}
