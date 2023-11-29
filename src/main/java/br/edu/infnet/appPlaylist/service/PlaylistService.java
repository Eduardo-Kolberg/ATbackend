package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.PlaylistRepository;
import br.edu.infnet.appPlaylist.model.domain.Musica;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PlaylistService {

    @Autowired
    PlaylistRepository service;


    public void incluir(Playlist playlist){
        service.save(playlist);
    }

    public Collection<Playlist> obterMap(){
        return (Collection<Playlist>) service.findAll();
    }

}
