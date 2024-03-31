package ru.stanislav.spring.service;

import ru.stanislav.spring.entity.User;

import java.io.IOException;
import java.util.List;

public interface UserService {

    List<User> listAll();


    User getById(Long id);

    User save(User user);

    User updateUser(Long id, User user);


    User addUser(User user);

    void delete(Long id);
}
