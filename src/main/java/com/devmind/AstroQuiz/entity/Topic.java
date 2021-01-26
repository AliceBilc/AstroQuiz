package com.devmind.AstroQuiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "topics")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Topic {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "picture", columnDefinition="BLOB")
    private byte[] picture;

    @Column(name = "content", length = 16777215, columnDefinition = "mediumtext")
    private String content;

    @OneToOne
    @JoinColumn(name = "id")
    private Author author;

}
