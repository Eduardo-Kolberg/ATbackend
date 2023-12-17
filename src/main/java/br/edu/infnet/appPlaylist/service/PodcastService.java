package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.PodcastRepository;
import br.edu.infnet.appPlaylist.model.domain.Podcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class PodcastService {

    @Autowired
    PodcastRepository service;

    public void incluir(Podcast midia){
        service.save(midia);
    }

    public Collection<Podcast> obterPodCast(){
        return (Collection<Podcast>) service.findAll();
    }

    public void excluir(Integer id){
        service.deleteById(id);
    }

}
