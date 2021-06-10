package com.example.webProject.controller;

import com.example.webProject.model.Item;
import com.example.webProject.model.User;
import com.example.webProject.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    private  static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @GetMapping("/registration")
    public ModelAndView registration() {
        logger.info("Going to registration page");
        return new ModelAndView("registration");
    }

    @PostMapping("/registrate")
    public ModelAndView wellcome(@RequestParam("name") String name,
                                 @RequestParam("surname") String surname,
                                 @RequestParam("login") String login,
                                 @RequestParam("password") String password) {

        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setLogin(login);
        user.setPassword(password);

        registrationService.registrateUser(user);

        logger.info("Going to wellcome page");
        ModelAndView view = new ModelAndView("wellcome");
        view.addObject("name", name);
        view.addObject("surname", surname);
        view.addObject("login", login);
        view.addObject("password", password);
        return view;
    }

    @GetMapping("/generateLogin")
    public ModelMap generateLogin() {
        ModelMap map = new ModelMap();
        String login = registrationService.generateLogin();
        map.put("result", "success");
        map.put("login", login);
        return map;
    }

    @GetMapping("/generatePassword")
    public ModelMap generatePassword() {
        ModelMap map = new ModelMap();
        String password = registrationService.generatePassword();
        map.put("result", "success");
        map.put("password", password);
        return map;
    }

    // api
//    @GetMapping("/generateLogin")
//    public String generateLogin() {
//        String login = registrationService.generateLogin();
//        return login;
//    }
}
