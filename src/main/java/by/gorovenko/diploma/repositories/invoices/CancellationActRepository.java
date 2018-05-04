package by.gorovenko.diploma.repositories.invoices;

import by.gorovenko.diploma.model.invoices.CancellationAct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface CancellationActRepository extends JpaRepository<CancellationAct, Long> {

    Optional<CancellationAct> findById(Long id);

    Optional<CancellationAct> findByActNumber(Long actNumber);

    Optional<CancellationAct> findByIncomingDate(Date incomingDate);

    Optional<CancellationAct> findByOutcomingDate(Date outcomingDate);


}
