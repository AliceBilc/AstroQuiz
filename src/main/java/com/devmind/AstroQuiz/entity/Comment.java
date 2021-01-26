package com.devmind.AstroQuiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "parent_id")
    private Comment parentComment;

    @Column(name = "content")
    private String content;

    @OneToOne
    @JoinColumn(name = "id")
    private User author;

    @OneToOne
    @JoinColumn(name = "id")
    private Topic topic;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

}
