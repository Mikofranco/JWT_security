package org.example.data.repo;

import org.example.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Component
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String Email);
}
