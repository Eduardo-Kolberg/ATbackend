package br.edu.infnet.appPlaylist.model.domain;


import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Entity
public class Podcast extends Midia{

    private int episodio;
    private String apresentadores;

    private String convidado;

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getApresentadores() {
        return apresentadores;
    }

    public void setApresentadores(String apresentadores) {
        this.apresentadores = apresentadores;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "convidado='" + convidado + '\'' +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", favorita=" + favorita +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
