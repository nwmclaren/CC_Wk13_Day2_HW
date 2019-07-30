package com.codeclan.FilesFolders.repository;

import com.codeclan.FilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
