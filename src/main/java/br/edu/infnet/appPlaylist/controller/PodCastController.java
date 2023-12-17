package br.edu.infnet.appPlaylist.controller;


import br.edu.infnet.appPlaylist.model.domain.Podcast;
import br.edu.infnet.appPlaylist.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/podCast")
public class PodCastController {

    @Autowired
    PodcastService podcastService;

    @GetMapping(value = "/listar")
    public List<Podcast> obterLista(){
        return (List<Podcast>) podcastService.obterPodCast();
    }

    @PostMapping(value = "/incluir")
    public void incluirPodCast(@RequestBody Podcast podcast){
        podcastService.incluir(podcast);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id){
        podcastService.excluir(id);
    }
}
