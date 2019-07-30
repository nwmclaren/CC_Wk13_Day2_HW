package com.codeclan.FilesFolders.repository;

import com.codeclan.FilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
