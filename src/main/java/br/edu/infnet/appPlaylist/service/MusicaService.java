package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.MusicaRepository;
import br.edu.infnet.appPlaylist.model.domain.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class MusicaService {

    @Autowired
    MusicaRepository service;

    public void incluir(Musica midia){
        service.save(midia);
    }

    public Collection<Musica> obterMusicas(){
        return (Collection<Musica>) service.findAll();
    }

    public void excluir(Integer id){
        service.deleteById(id);
    }

}
