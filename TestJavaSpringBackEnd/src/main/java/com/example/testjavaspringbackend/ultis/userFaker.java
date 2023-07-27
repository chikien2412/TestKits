package com.example.testjavaspringbackend.ultis;

import com.example.testjavaspringbackend.Model.users;
import com.example.testjavaspringbackend.Repository.userRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class userFaker implements CommandLineRunner {

    private final userRepository UserRepository;
    private final Faker faker;

    @Autowired
    public userFaker(userRepository UserRepository) {
        this.UserRepository = UserRepository;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) {
        // Generate fake user data and save it to the database
        for (int i = 0; i < 10; i++) {
            users user = new users();
            user.setUsername(faker.name().username());
            user.setEmail(faker.internet().emailAddress());
            user.setPassword(faker.internet().password());
            user.setProfilePicture(faker.internet().avatar());
            user.setBio(faker.lorem().sentence());
            user.setCreatedAt(LocalDateTime.now());
            user.setUpdatedAt(LocalDateTime.now());
            UserRepository.save(user);
        }
    }
}
