package by.gorovenko.diploma.repositories.invoices;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.invoices.SalesInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalesInvoiceRepository extends JpaRepository<SalesInvoice, Long> {

    Optional<SalesInvoice> findById(Long id);

    Optional<SalesInvoice> findByGoods(Goods goods);

}
