package org.example.passwordsaver.repository;

import org.example.passwordsaver.models.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<Password , Long> {
}
