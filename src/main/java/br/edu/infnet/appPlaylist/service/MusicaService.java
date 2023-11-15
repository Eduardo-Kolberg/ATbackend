package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.model.domain.Musica;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MusicaService {

    private final Map<String, Musica> midiaMap = new HashMap<>();

    public void incluir(Musica midia){
        midiaMap.put(midia.getId(),midia);
    }

    public Map<String,Musica> obterMap(){
        return midiaMap;
    }

}
