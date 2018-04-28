package by.gorovenko.diploma.repositories;

import by.gorovenko.diploma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByLoginOrEmail(String login, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findById(Long userId);

    Optional<User> findByLogin(String login);

    Boolean existsByLogin(String login);

    Boolean existsByEmail(String email);
}
