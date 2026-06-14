package org.example.ecommercespringboot.Controller;

import org.example.ecommercespringboot.DTO.UserDTO.UserRequest;
import org.example.ecommercespringboot.DTO.UserDTO.UserResponse;
import org.example.ecommercespringboot.Models.User;
import org.example.ecommercespringboot.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(
            @RequestBody UserRequest request) {

        return ResponseEntity.ok(
                userService.createUser(request));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUser(
            @PathVariable Long id) {
        return ResponseEntity.ok(
                userService.getUser(id));
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return ResponseEntity.ok(
                userService.getAllUsers());
    }
}