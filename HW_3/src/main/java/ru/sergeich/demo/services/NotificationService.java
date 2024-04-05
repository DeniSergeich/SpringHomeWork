package ru.sergeich.demo.services;

import ru.sergeich.demo.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public String sendNotification(User user) {
        return "A new user has benn created: " + user.getName();
    }
}
