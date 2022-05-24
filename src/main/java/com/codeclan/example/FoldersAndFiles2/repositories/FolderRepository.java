package com.codeclan.example.FoldersAndFiles2.repositories;

import com.codeclan.example.FoldersAndFiles2.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
