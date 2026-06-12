package org.example.ecommercespringboot.Service.Impl;

import org.example.ecommercespringboot.DTO.UserDTO.UserRequest;
import org.example.ecommercespringboot.DTO.UserDTO.UserResponse;
import org.example.ecommercespringboot.Models.User;
import org.example.ecommercespringboot.Repository.UserRepository;
import org.example.ecommercespringboot.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse createUser(UserRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setPassword(request.getPassword());

        User savedUser = userRepository.save(user);

        return new UserResponse(
                savedUser.getId(),
                savedUser.getUsername()
        );
    }
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found with id: " + id));
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream().map(user -> new UserResponse(user.getId(),user.getUsername())).toList();
    }

    @Override
    public User updateUser(Long id, User updatedUser) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found with id: " + id));
        return userRepository.save(existingUser);
    }

    @Override
    public void delteUser(Long id) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found with id: " + id));

        userRepository.delete(existingUser);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }
}