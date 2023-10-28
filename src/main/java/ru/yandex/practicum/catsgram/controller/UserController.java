package ru.yandex.practicum.catsgram.controller;

<<<<<<< HEAD

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.catsgram.model.User;
import ru.yandex.practicum.catsgram.service.UserService;

import java.util.Optional;
>>>>>>> 221ef09 (стартовое задание котограм)

@RestController
@RequestMapping("/users")
public class UserController {
<<<<<<< HEAD
    private final Map<String, User> users = new HashMap<>();

    @GetMapping
    public Collection<User> findAll() {
        return users.values();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        if(user.getEmail() == null || user.getEmail().isBlank()) {
            throw new InvalidEmailException("Адрес электронной почты не может быть пустым.");
        }
        if(users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException("Пользователь с электронной почтой " +
                    user.getEmail() + " уже зарегистрирован.");
        }
        users.put(user.getEmail(), user);
        return user;
    }

    @PutMapping
    public User put(@RequestBody User user) {
        if(user.getEmail() == null || user.getEmail().isBlank()) {
            throw new InvalidEmailException("Адрес электронной почты не может быть пустым.");
        }
        users.put(user.getEmail(), user);

        return user;
    }
}
=======
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{login}")
    public Optional<User> getUser(@PathVariable String login){
        return userService.findUserById(login);
    }
}
>>>>>>> 221ef09 (стартовое задание котограм)
