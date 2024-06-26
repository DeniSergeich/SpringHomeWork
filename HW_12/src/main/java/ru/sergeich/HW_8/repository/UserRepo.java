package ru.sergeich.HW_8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeich.HW_8.domain.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
}
