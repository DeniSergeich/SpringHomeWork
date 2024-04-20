package ru.sergeich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeich.domain.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
}