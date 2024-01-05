package com.anghel.music_band_organizer.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name =  "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}