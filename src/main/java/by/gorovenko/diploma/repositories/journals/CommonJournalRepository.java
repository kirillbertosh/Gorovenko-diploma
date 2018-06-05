package by.gorovenko.diploma.repositories.journals;

import by.gorovenko.diploma.model.journals.CommonJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;
import java.util.*;

@Repository
public interface CommonJournalRepository extends JpaRepository<CommonJournal, Long> {

    Optional<CommonJournal> findByDocumentNumber(Long documentNumber);

    Optional<List<CommonJournal>> findByArrivalDate(Date arrivalDate);

    List<CommonJournal> findByConsumptionDate(Date consumptionDate);

    @Query("select * from CommonJournal j where j.arrivalDate >= :start_date and j.consumptionDate <= :end_date")
    List<CommonJournal> findByPeriod(@Param("start_date") Date startDate, @Param("end_date") Date endDate);

}


