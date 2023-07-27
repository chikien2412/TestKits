package com.example.testjavaspringbackend.Repository;

import com.example.testjavaspringbackend.Model.posts;
import com.example.testjavaspringbackend.Model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepository extends JpaRepository<posts, Integer> {
}
