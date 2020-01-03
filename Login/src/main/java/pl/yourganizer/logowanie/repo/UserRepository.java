package pl.yourganizer.logowanie.repo;

import org.springframework.data.repository.CrudRepository;
import pl.yourganizer.logowanie.model.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
}