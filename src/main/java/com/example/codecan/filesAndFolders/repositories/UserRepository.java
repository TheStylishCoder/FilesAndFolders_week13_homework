package com.example.codecan.filesAndFolders.repositories;

import com.example.codecan.filesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
