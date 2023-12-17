package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.AudioBookRepository;
import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class AudioBookService {

    @Autowired
    private AudioBookRepository service;

    public void incluir(AudioBook midia){
        service.save(midia);
    }

    public Collection<AudioBook> obterAudioBook(){
        return (Collection<AudioBook>) service.findAll();
    }

    public void excluir(Integer id){
        service.deleteById(id);
    }

}
