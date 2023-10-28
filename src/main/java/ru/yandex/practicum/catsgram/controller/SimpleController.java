package ru.yandex.practicum.catsgram.controller;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> 221ef09 (стартовое задание котограм)
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

<<<<<<< HEAD

    private static final Logger log = LoggerFactory.getLogger(SimpleController.class);
    @GetMapping("/home")

    public String homePage() {
        log.debug("Получен запрос GET /home.");
        return "Котограм";
    }
}
=======
    @GetMapping("/home")
    public String homePage() {
        return "Котограм";
    }
}
>>>>>>> 221ef09 (стартовое задание котограм)
