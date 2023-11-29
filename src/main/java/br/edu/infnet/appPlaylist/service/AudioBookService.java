package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.AudioBookRepository;
import br.edu.infnet.appPlaylist.Repositories.PlaylistRepository;
import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AudioBookService {

    @Autowired
    AudioBookRepository service;

    private final Map<Integer, AudioBook> midiaMap = new HashMap<>();

    public void incluir(AudioBook midia){
        service.save(midia);
    }

    public Collection<AudioBook> obterMap(){
        return (Collection<AudioBook>) service.findAll();
    }

}
