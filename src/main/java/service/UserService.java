package service;

import model.User;

import java.util.List;

public interface UserService {

    void create (User user);
    void update (User user);
    void delete (Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String name);

}
