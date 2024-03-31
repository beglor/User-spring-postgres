package ru.stanislav.spring.service.impl;

import org.springframework.stereotype.Service;
import ru.stanislav.spring.entity.User;
import ru.stanislav.spring.repository.UserRepository;
import ru.stanislav.spring.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(Long id, User user) {
        User updatedUser = userRepository.findById(user.getId()).orElseThrow();
        updatedUser.setId(user.getId());
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());

        userRepository.save(updatedUser);
        return updatedUser;
    }

    @Override
    public User addUser(User user){
        User newUser= new User();
        newUser.setName(user.getName());
        newUser.setSurname(user.getSurname());

        return newUser;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}