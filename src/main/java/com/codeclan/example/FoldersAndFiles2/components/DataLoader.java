package com.codeclan.example.FoldersAndFiles2.components;

import com.codeclan.example.FoldersAndFiles2.models.File;
import com.codeclan.example.FoldersAndFiles2.models.Folder;
import com.codeclan.example.FoldersAndFiles2.models.User;
import com.codeclan.example.FoldersAndFiles2.repositories.FileRepository;
import com.codeclan.example.FoldersAndFiles2.repositories.FolderRepository;
import com.codeclan.example.FoldersAndFiles2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User daisy = new User("Daisy");
        userRepository.save(daisy);

        Folder snackFolder = new Folder("snack folder", daisy);
        folderRepository.save(snackFolder);

        Folder petPhotos = new Folder("pet photos", daisy);
        folderRepository.save(petPhotos);

        File peanuts = new File("peanuts", ".txt", "300KB", snackFolder);
        fileRepository.save(peanuts);

        File apples = new File("apples", ".txt", "600KB", snackFolder);
        fileRepository.save(apples);

        File sweetPotatoFries = new File("sweet potato fries", ".txt", "1000KB", snackFolder);
        fileRepository.save(sweetPotatoFries);

        File alejandro = new File("alejandro the dog", ".png", "400KB", petPhotos);
        fileRepository.save(alejandro);

        File garry = new File("garry the turtle", ".png", "365KB", petPhotos);
        fileRepository.save(garry);

    }
}

