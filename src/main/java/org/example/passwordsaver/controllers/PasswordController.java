package org.example.passwordsaver.controllers;

import org.example.passwordsaver.models.Password;
import org.example.passwordsaver.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/passwords")
public class PasswordController {

    @Autowired
    private PasswordRepository passwordRepository;

    @GetMapping
    public List<Password> getAllPasswords() {
        return passwordRepository.findAll();
    }

    @PostMapping
    public Password addPassword(@RequestBody Password password) {
        return passwordRepository.save(password);
    }

    @DeleteMapping("/{id}")
    public void deletePassword(@PathVariable Long id) {
        passwordRepository.deleteById(id);
    }

}
