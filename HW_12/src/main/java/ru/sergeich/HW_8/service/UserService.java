package ru.sergeich.HW_8.service;

import ru.sergeich.HW_8.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    User getUserById(Long id);
    void deleteUserById(Long id);
}
