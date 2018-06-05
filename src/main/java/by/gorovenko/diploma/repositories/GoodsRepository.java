package by.gorovenko.diploma.repositories;

import by.gorovenko.diploma.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {
}
