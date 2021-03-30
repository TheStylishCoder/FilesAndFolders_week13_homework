package com.example.codecan.filesAndFolders;


import com.example.codecan.filesAndFolders.models.File;
import com.example.codecan.filesAndFolders.models.Folder;
import com.example.codecan.filesAndFolders.models.User;
import com.example.codecan.filesAndFolders.repositories.FileRepository;
import com.example.codecan.filesAndFolders.repositories.FolderRepository;
import com.example.codecan.filesAndFolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser(){
		User april = new User("April");
		userRepository.save(april);
		Folder react = new Folder("React Tutorial", april);
		folderRepository.save(react);
		File notes = new File("React Extra Notes", ".md", 4, react);
		fileRepository.save(notes);

	}



}
