package com.example.codecan.filesAndFolders.components;

import com.example.codecan.filesAndFolders.models.User;
import com.example.codecan.filesAndFolders.models.Folder;
import com.example.codecan.filesAndFolders.models.File;
import com.example.codecan.filesAndFolders.repositories.UserRepository;
import com.example.codecan.filesAndFolders.repositories.FolderRepository;
import com.example.codecan.filesAndFolders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        User leslie = new User("Leslie");
        userRepository.save(leslie);
        User ron = new User("Ron");
        userRepository.save(ron);
        User tom = new User("Tom");
        userRepository.save(tom);
        User donna = new User("Donna");
        userRepository.save(donna);

        Folder java = new Folder("Java", leslie);
        folderRepository.save(java);
        Folder python = new Folder("Python", ron);
        folderRepository.save(python);
        Folder javascript = new Folder("JavaScript", tom);
        folderRepository.save(javascript);
        Folder css = new Folder("CSS", donna);
        folderRepository.save(css);
        Folder html = new Folder("HTML", donna);
        folderRepository.save(html);

        File spring = new File("Spring Intro", ".md", 8, java);
        fileRepository.save(spring);
        File principles = new File("SOLID Principles", ".png", 4, java);
        fileRepository.save(principles);
        File functions = new File("Functions", ".txt", 5, python);
        fileRepository.save(functions);
        File postgresql = new File("PostgreSQL intro", ".md", 6, python);
        fileRepository.save(postgresql);
        File loops = new File("Types of Loops", ".md", 8, javascript);
        fileRepository.save(loops);
        File briefs = new File("Project Briefs", ".txt", 5, javascript);
        fileRepository.save(briefs);
        File flexbox = new File("Flexbox Tutorial", ".pdf", 10, css);
        fileRepository.save(flexbox);
        File forms = new File("HTML Form Reference", ".md", 7, html);
        fileRepository.save(forms);

    }
}
