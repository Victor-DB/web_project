package com.example.webProject.dao;

import com.example.webProject.exceptions.UserException;
import com.example.webProject.model.User;
import com.example.webProject.model.UserExceptionEnum;
import com.example.webProject.model.UserRoleEnum;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Transactional
@Repository
public class RegistrationDAO {

    List<User> users = new ArrayList<>();

    public void registrateUser(User user) {

        for(User u : users) {
           if (user.equals(u)) {
               try {
                   throw new UserException(UserExceptionEnum.USER_ALREADY_EXIST.getMessage());
               } catch (UserException e) { e.printStackTrace(); }
           } else {
               int id = 1 + users.size();
               Set<String> roles = new HashSet<>();
               roles.add(UserRoleEnum.CLIENT.getName());
               user.setRole(roles);
           }
        }

    }



    public boolean isLoginExist(String login) {
        return false;
    }

    public String generatePassword() {
        return  null;
    }
}
