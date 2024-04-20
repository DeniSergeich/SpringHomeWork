package ru.sergeich.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeich.aop.TrackUserAction;
import ru.sergeich.domain.User;
import ru.sergeich.repository.UserRepo;
import ru.sergeich.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    @TrackUserAction
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    @TrackUserAction
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    @TrackUserAction
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    @TrackUserAction
    public void deleteUserById(Long id) {
        User user = getUserById(id);
        userRepo.delete(user);
    }
}