package by.gorovenko.diploma.repositories.invoices;

import by.gorovenko.diploma.model.Supplier;
import by.gorovenko.diploma.model.invoices.ComingInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface ComingInvoiceRepository extends JpaRepository<ComingInvoice, Long> {

    Optional<ComingInvoice> findById(Long id);

    Optional<ComingInvoice> findByDate(Date date);

    Optional<ComingInvoice> findBySupplier(Supplier supplier);

    Optional<ComingInvoice> findByInvoiceNumber(Long invoiceNumber);
}
