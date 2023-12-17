package br.edu.infnet.appPlaylist.controller;

import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import br.edu.infnet.appPlaylist.service.AudioBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/audioBook")
public class AudioBookController {

    @Autowired
    AudioBookService audioBookServiceService;

    @GetMapping(value = "/listar")
    public List<AudioBook> obterLista(){
        return (List<AudioBook>) audioBookServiceService.obterAudioBook();
    }

    @PostMapping(value = "/incluir")
    public void incluirAudioBook(@RequestBody AudioBook audioBook){
        audioBookServiceService.incluir(audioBook);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id){
        audioBookServiceService.excluir(id);
    }
}
