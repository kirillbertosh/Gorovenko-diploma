package by.gorovenko.diploma.repositories.reports;

import by.gorovenko.diploma.model.reports.ProductReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductReportRepository extends JpaRepository<ProductReport, Long> {

    Optional<ProductReport> findById(Long id);
}
