package org.example.ecommercespringboot.Service;
import org.example.ecommercespringboot.Models.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);

    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void delteUser(Long id);
}