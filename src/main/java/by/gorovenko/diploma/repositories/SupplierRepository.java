package by.gorovenko.diploma.repositories;

import by.gorovenko.diploma.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
