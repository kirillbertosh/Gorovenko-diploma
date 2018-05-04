package by.gorovenko.diploma.repositories.reports;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.reports.ProductDepartureReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductDepartureReportRepository extends JpaRepository<ProductDepartureReport, Long> {

    Optional<ProductDepartureReport> findById(Long id);

    Optional<ProductDepartureReport> findByGoods(Goods goods);
}
