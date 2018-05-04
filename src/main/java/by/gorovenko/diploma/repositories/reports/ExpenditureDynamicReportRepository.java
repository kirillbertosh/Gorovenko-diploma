package by.gorovenko.diploma.repositories.reports;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.reports.ExpenditureDynamicReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenditureDynamicReportRepository extends JpaRepository<ExpenditureDynamicReport, Long> {

    Optional<ExpenditureDynamicReport> findById(Long id);

    Optional<ExpenditureDynamicReport> findByGoods(Goods goods);
}
