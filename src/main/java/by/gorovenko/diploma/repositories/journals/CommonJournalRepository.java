package by.gorovenko.diploma.repositories.journals;

import by.gorovenko.diploma.model.journals.CommonJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;
import java.util.*;

@Repository
public interface CommonJournalRepository extends JpaRepository<CommonJournal, Long> {

    Optional<CommonJournal> findById(Long id);

    Optional<CommonJournal> findByDocumentNumber(Long documentNumber);

    Optional<List<CommonJournal>> findByArrivalDate(Date arrivalDate);

    List<CommonJournal> findByConsumptionDate(Date consumptionDate);


}
