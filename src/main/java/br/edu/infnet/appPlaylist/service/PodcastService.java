package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.MusicaRepository;
import br.edu.infnet.appPlaylist.Repositories.PodcastRepository;
import br.edu.infnet.appPlaylist.model.domain.Musica;
import br.edu.infnet.appPlaylist.model.domain.Podcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PodcastService {

    @Autowired
    PodcastRepository service;
    private final Map<Integer, Podcast> midiaMap = new HashMap<>();

    public void incluir(Podcast midia){
        service.save(midia);
    }

    public Collection<Podcast> obterMap(){
        return (Collection<Podcast>) service.findAll();
    }

}
