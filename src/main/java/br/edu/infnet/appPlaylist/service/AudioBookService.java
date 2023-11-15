package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AudioBookService {

    private final Map<String, AudioBook> midiaMap = new HashMap<>();

    public void incluir(AudioBook midia){
        midiaMap.put(midia.getId(),midia);
    }

    public Map<String,AudioBook> obterMap(){
        return midiaMap;
    }

}
