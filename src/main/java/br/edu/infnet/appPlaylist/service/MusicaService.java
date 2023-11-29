package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.AudioBookRepository;
import br.edu.infnet.appPlaylist.Repositories.MusicaRepository;
import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import br.edu.infnet.appPlaylist.model.domain.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MusicaService {

    @Autowired
    MusicaRepository service;
    private final Map<Integer, Musica> midiaMap = new HashMap<>();

    public void incluir(Musica midia){
        service.save(midia);
    }

    public Collection<Musica> obterMap(){
        return (Collection<Musica>) service.findAll();
    }

}
