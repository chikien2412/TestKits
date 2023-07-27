package com.example.testjavaspringbackend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Likes")
@Getter
@Setter
public class likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private int like_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private users user;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private posts post;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
