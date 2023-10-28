package ru.yandex.practicum.catsgram.controller;
<<<<<<< HEAD

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.catsgram.model.Post;
import java.util.ArrayList;
import java.util.List;
@RestController
public class PostController {
    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    private final List<Post> posts = new ArrayList<>();

    @GetMapping("/posts")
    public List<Post> findAll() {
        log.debug("Текущее количество постов: {}", posts.size());
        return posts;
    }

    @PostMapping(value = "/post")
    public void create(@RequestBody Post post) {
        posts.add(post);
    }
}
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.service.PostService;

import java.util.Collection;

@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public Collection<Post> findAll(@RequestParam String userId) {
        return postService.findPostsByUser(userId);
    }
}
>>>>>>> 221ef09 (стартовое задание котограм)
