package by.gorovenko.diploma.repositories.journals;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.journals.ArrivalJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;
import java.util.*;

@Repository
public interface ArrivalJournalRepository extends JpaRepository<ArrivalJournal, Long> {

    Optional<ArrivalJournal> findById(Long id);

    List<ArrivalJournal> findByArrivalDate(Date arrivalDate);

    List<ArrivalJournal> findByGoods(Goods goods);
}
