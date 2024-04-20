package ru.sergeich.service;

import ru.sergeich.domain.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    User getUserById(Long id);
    void deleteUserById(Long id);
}