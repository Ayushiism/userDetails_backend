package com.example.userDetails_backend.model;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "device")
    private String device;

    @Column(name = "phone")
    private String phone;

    @Column(name = "pId")
    private long pId;

    @ManyToOne
    private Plan plan;

}
