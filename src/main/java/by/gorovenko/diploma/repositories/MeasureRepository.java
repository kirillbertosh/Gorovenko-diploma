package by.gorovenko.diploma.repositories;

import by.gorovenko.diploma.model.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
}
