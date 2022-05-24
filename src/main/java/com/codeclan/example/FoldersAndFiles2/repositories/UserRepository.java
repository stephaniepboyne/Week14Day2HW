package com.codeclan.example.FoldersAndFiles2.repositories;

import com.codeclan.example.FoldersAndFiles2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
