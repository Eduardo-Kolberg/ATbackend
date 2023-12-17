package br.edu.infnet.appPlaylist.controller;

import br.edu.infnet.appPlaylist.model.domain.Musica;
import br.edu.infnet.appPlaylist.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/musica")
public class MusicaController {

    @Autowired
    MusicaService musicaService;

    @GetMapping(value = "/listar")
    public List<Musica> obterLista(){
        return (List<Musica>) musicaService.obterMusicas();
    }

    @PostMapping(value = "/incluir")
    public void incluirMusica(@RequestBody Musica musica){
        musicaService.incluir(musica);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id){
        musicaService.excluir(id);
    }
}
