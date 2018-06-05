package by.gorovenko.diploma.repositories;

import by.gorovenko.diploma.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
}
