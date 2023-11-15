package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.model.domain.Musica;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlaylistService {

    private final Map<String, Playlist> playlistaMap = new HashMap<>();

    public void incluir(Playlist playlist){
        playlistaMap.put(playlist.getId(),playlist);
    }

    public Map<String,Playlist> obterMap(){
        return playlistaMap;
    }

}
