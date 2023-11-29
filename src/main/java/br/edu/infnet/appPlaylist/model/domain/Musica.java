package br.edu.infnet.appPlaylist.model.domain;

import jakarta.persistence.Entity;

@Entity
public class Musica extends Midia{
    private String estilo;
    private String nomeArtista;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nomeArtista='" + nomeArtista + '\'' +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", favorita=" + favorita +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
