package org.example.ecommercespringboot.Service;
import org.example.ecommercespringboot.DTO.UserDTO.UserRequest;
import org.example.ecommercespringboot.DTO.UserDTO.UserResponse;
import org.example.ecommercespringboot.Models.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public UserResponse createUser(UserRequest request);
    User getUserById(Long id);

    List<UserResponse> getAllUsers();
    User updateUser(Long id, User user);
    void delteUser(Long id);

    Optional<User> getUser(Long id);
}