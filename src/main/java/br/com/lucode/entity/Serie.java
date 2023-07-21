package br.com.lucode.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "series")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    @Column(length = 500)
    private String description;
    private String country;
    private boolean watched;
    private int qtdEpisodes;
    private String genre;

    public Serie(String name, String description, String country, boolean watched, int qtdEpisodes, String genre) {
        this.name = name;
        this.description = description;
        this.country = country;
        this.watched = watched;
        this.qtdEpisodes = qtdEpisodes;
        this.genre = genre;
    }

    public Serie() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public int getQtdEpisodes() {
        return qtdEpisodes;
    }

    public void setQtdEpisodes(int qtdEpisodes) {
        this.qtdEpisodes = qtdEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
