package com.nagraaa.tv.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "tv_show_id")
    private Long tvShowId;



    public Character() {}

    public Character(Long id, String name, String description, Long tvShowId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tvShowId = tvShowId;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTvShowId() {
        return tvShowId;
    }

    public void setTvShowId(Long tvShowId) {
        this.tvShowId = tvShowId;
    }

}