package com.example.testjavaspringbackend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Friends")
@Getter
@Setter
public class friends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private int friend_id;

    @ManyToOne
    @JoinColumn(name = "user_id1", nullable = false)
    private users user1;

    @ManyToOne
    @JoinColumn(name = "user_id2", nullable = false)
    private users user2;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "action_user_id", nullable = false)
    private users actionUser;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
