package com.example.codecan.filesAndFolders.repositories;

import com.example.codecan.filesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
