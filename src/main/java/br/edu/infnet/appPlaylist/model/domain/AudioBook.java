package br.edu.infnet.appPlaylist.model.domain;

import jakarta.persistence.Entity;


@Entity
public class AudioBook extends Midia{
    private String autor;
    private String nomeSerie;
    private String volume;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeSerie() {
        return nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "volume='" + volume + '\'' +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", favorita=" + favorita +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
