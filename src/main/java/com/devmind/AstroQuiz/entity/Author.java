package com.devmind.AstroQuiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Lob
    @Column(name = "picture", columnDefinition="BLOB")
    private byte[] picture;

}
