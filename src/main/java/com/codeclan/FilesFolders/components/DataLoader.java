package com.codeclan.FilesFolders.components;

import com.codeclan.FilesFolders.models.File;
import com.codeclan.FilesFolders.models.Folder;
import com.codeclan.FilesFolders.models.User;
import com.codeclan.FilesFolders.repository.FileRepository;
import com.codeclan.FilesFolders.repository.FolderRepository;
import com.codeclan.FilesFolders.repository.UserRepository;
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

public void run(ApplicationArguments args){
    User user1 = new User ("Neil");
    userRepository.save(user1);

    Folder folder1 = new Folder("Stocks and Shares", user1);
    folderRepository.save(folder1);

    File file1 = new File("Stocks",".doc",5, folder1);
    fileRepository.save(file1);
}


}
