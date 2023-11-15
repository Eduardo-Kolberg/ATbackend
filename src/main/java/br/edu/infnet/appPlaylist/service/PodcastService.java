package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.model.domain.Podcast;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PodcastService {

    private final Map<String, Podcast> midiaMap = new HashMap<>();

    public void incluir(Podcast midia){
        midiaMap.put(midia.getId(),midia);
    }

    public Map<String,Podcast> obterMap(){
        return midiaMap;
    }

}
