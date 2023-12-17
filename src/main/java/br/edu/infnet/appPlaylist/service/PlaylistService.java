package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.PlaylistRepository;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PlaylistService {

    @Autowired
    PlaylistRepository service;


    public void incluir(Playlist playlist){
        service.save(playlist);
    }

    public Collection<Playlist> obterPlaylist(){
        return (Collection<Playlist>) service.findAll();
    }

    public void excluir(Integer id){
        service.deleteById(id);
    }

}
