package ru.yandex.practicum.catsgram.model;
<<<<<<< HEAD

import java.time.Instant;

public class Post {

    private final String author; // автор
    private final Instant creationDate = Instant.now(); // дата создания
    private String description; // описание
    private String photoUrl; // url-адрес фотографии

    public Post(String author, String description, String photoUrl) {
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreationDate() {
=======
import java.time.LocalDate;

public class Post {

    private Integer id;
    private final User author; // автор
    private final LocalDate creationDate; // дата создания
    private String description; // описание
    private String photoUrl; // url-адрес фотографии

    public Post(User author, String description, String photoUrl) {
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
        this.creationDate = LocalDate.now();
    }

    public Post(Integer id, User author, String description, String photoUrl, LocalDate creationDate) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDate getCreationDate() {
>>>>>>> 221ef09 (стартовое задание котограм)
        return creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 221ef09 (стартовое задание котограм)
