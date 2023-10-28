package ru.yandex.practicum.catsgram.model;
<<<<<<< HEAD

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String email;
    private String nickname;
    private LocalDate birthdate;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
=======
public class User {

    private String id;

    private String username;

    private String nickname;

    public User() {
    }

    public User(String id, String username, String nickname) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
>>>>>>> 221ef09 (стартовое задание котограм)
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

<<<<<<< HEAD
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
=======
    public String getId() {
        return id;
    };
}
>>>>>>> 221ef09 (стартовое задание котограм)
