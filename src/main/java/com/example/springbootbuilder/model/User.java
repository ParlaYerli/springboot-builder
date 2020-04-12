package com.example.springbootbuilder.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="name")
    public String name;
}
