package com.example.testjavaspringbackend.Repository;

import com.example.testjavaspringbackend.Model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<users, Integer> {
}
