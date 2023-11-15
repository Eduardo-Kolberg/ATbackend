package br.edu.infnet.appPlaylist.model.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Playlist {
    private String id;

    private Usuario usuario;

    private String nome;

    private List<Midia> midiaList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Midia> getMidiaList() {
        return midiaList;
    }

    public void setMidiaList(List<Midia> midiaList) {
        this.midiaList = midiaList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", usuario=" + usuario +
                ", midiaList=" + midiaList +
                '}';
    }
}
