package ru.stanislav.spring.service.impl;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import ru.stanislav.spring.entity.User;
import ru.stanislav.spring.repository.UserRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@MockitoSettings
class UserServiceImplTest {
    @Mock
    private UserRepository user;
    @InjectMocks
    private UserServiceImpl userService;


    @Test
    void listAll() {

        when(user.findAll()).thenReturn(List.of());
        List<User> users = userService.listAll();

        verify(user,times(1)).findAll();
    }



    @Test
    void getById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }
}