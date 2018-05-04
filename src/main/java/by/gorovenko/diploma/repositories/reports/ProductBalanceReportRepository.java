package by.gorovenko.diploma.repositories.reports;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.reports.ProductBalanceReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductBalanceReportRepository extends JpaRepository<ProductBalanceReport, Long> {

    Optional<ProductBalanceReport> findById(Long id);

    Optional<ProductBalanceReport> findByGoods(Goods goods);
}
