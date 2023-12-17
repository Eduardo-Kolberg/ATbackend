package br.edu.infnet.appPlaylist.model.domain;

import br.edu.infnet.appPlaylist.utils.TimeUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String nome;
    protected double duracao;
    protected boolean favorita;
    protected String tipo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idPlaylist")
    private Playlist playlist;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDuracao() {
        return TimeUtils.getDuration(duracao);
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
