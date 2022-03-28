package com.example.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> getUser() {
        User user = new User("Martin", "Kelig");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
