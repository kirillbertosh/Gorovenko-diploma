package by.gorovenko.diploma.repositories;

import by.gorovenko.diploma.model.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {

    Optional<Contractor> findByName(String name);
}
