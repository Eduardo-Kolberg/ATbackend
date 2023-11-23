package br.edu.infnet.appPlaylist;

import br.edu.infnet.appPlaylist.model.domain.Midia;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import br.edu.infnet.appPlaylist.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@Order(5)
public class PlaylistLoader implements ApplicationRunner {

    @Autowired
    PlaylistService service;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    MusicaService musicaService;
    @Autowired
    PodcastService podcastService;
    @Autowired
    AudioBookService audioBookService;

    @Override
    @Order(5)
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("src/main/resources/FIles/Playlists.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            Playlist playlist = new Playlist();
            playlist.setNome(campos[0]);
            playlist.setId(UUID.randomUUID().toString());
            List<Usuario> value = new ArrayList<>(usuarioService.obterMap().values());
            playlist.setUsuario(value.get(0));
            for (Midia audioBook : audioBookService.obterMap().values()){
                audioBook.setIdPlaylist(playlist.getId());
                playlist.getMidiaList().add(audioBook);
            }
            for (Midia musica : musicaService.obterMap().values()){
                musica.setIdPlaylist(playlist.getId());
                playlist.getMidiaList().add(musica);
            }
            for (Midia podcast : podcastService.obterMap().values()){
                podcast.setIdPlaylist(playlist.getId());
                playlist.getMidiaList().add(podcast);
            }

            service.incluir(playlist);

            linha = leitura.readLine();
        }

        for(Playlist playlist : service.obterMap().values()) {
            System.out.println("[Playlist] " + playlist);
        }

        leitura.close();
    }
}
