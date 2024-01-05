package com.example.session.learning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
