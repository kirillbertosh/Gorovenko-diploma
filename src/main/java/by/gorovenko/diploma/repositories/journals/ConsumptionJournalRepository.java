package by.gorovenko.diploma.repositories.journals;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.journals.ConsumptionJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;
import java.util.*;

@Repository
public interface ConsumptionJournalRepository extends JpaRepository<ConsumptionJournal, Long> {

    Optional<ConsumptionJournal> findById(Long id);

    List<ConsumptionJournal> findByConsumptionDate(Date arrivalDate);

    List<ConsumptionJournal> findByGoods(Goods goods);
}
