package com.example.webProject.service;

import com.example.webProject.controller.FirstPageController;
import com.example.webProject.dao.RegistrationDAO;
import com.example.webProject.helper.Helper;
import com.example.webProject.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class RegistrationService {

    @Autowired
    RegistrationDAO registrationDAO;

    @Autowired
    Helper helper;

    private static final Logger logger = LoggerFactory.getLogger(FirstPageController.class);

    public void registrateUser(User user) {
        registrationDAO.registrateUser(user);
    }

    // автогенерация логина 6 символов
    public String generateLogin() {
        String login = helper.generateResult(65,90,6);
        if (registrationDAO.isLoginExist(login)) {
            generateLogin();
        }
        logger.info("Auto generation login for user with id {}", 0);
        return login;
    }

    // автогенерация пароля 8 символов
    public String generatePassword() {
        String password = helper.generateResult(65,90,8);
        logger.info("Auto generation password for user with id {}", 0);
        return password;
    }
}
