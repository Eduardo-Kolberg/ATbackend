package br.edu.infnet.appPlaylist.model.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Playlist {
//@OnetoMany(CascadeType.DETACH) botar em todos talvez para funcionar???
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPlaylist")
    private List<Midia> midiaList = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
                ", midiaList= " + midiaList +
                '}';
    }
}
