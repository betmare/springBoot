package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserController userController;

    @RequestMapping(method = RequestMethod.GET, headers = "Accept = application/json")
    public ResponseEntity getUsers(){

        return userController.getUsers();
    }
}
