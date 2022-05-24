package com.codeclan.example.FoldersAndFiles2.repositories;

import com.codeclan.example.FoldersAndFiles2.models.File;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaParam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

}
