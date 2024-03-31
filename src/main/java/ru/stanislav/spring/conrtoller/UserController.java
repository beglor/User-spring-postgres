package ru.stanislav.spring.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.stanislav.spring.entity.User;
import ru.stanislav.spring.repository.UserRepository;
import ru.stanislav.spring.service.UserService;


import java.io.IOException;


@Controller
public class UserController {
    private UserService userService;

    UserController(UserService userService) {
        this.userService = userService;

    }


    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String redirectToList() {
        return "redirect:/users/list";
    }

    @RequestMapping(value = {"/users/list", "/list"}, method = RequestMethod.GET)
    public String listUser(Model model) {
        model.addAttribute("users", userService.listAll());
        return "Users";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String addUser(@Validated User user, BindingResult result) {
        if (result.hasErrors()) {
            return "adduser";
        }

        userService.save(user);
        return "redirect:/users/list";
    }

    @RequestMapping(value = "/users/new", method = RequestMethod.GET)
    public String showAddUser(Model model, @Validated User user){
        model.addAttribute("user",userService.addUser(user));
        return "adduser";
    }
    @RequestMapping(value = "/users/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable String id) {
        userService.delete(Long.valueOf(id));
        return "redirect:/users/list";
    }

    @RequestMapping(value = "/users/show/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable String id, Model model) {
        model.addAttribute("user", userService.getById(Long.valueOf(id)));
        return "show";
    }

    @RequestMapping(value = "/users/show/{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable("id") String id,
                             @Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "show";
        }

        userService.save(user);
        return "redirect:/users/list";
    }
}