package br.edu.infnet.appPlaylist.controller;

import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import br.edu.infnet.appPlaylist.service.AudioBookService;
import br.edu.infnet.appPlaylist.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/playlist")
public class PlayListController {

    @Autowired
    PlaylistService playlistService;

    @GetMapping(value = "/listar")
    public List<Playlist> obterLista(){
        return (List<Playlist>) playlistService.obterPlaylist();
    }

    @PostMapping(value = "/incluir")
    public void incluirPlaylist(@RequestBody Playlist playlist){
        playlistService.incluir(playlist);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id){
        playlistService.excluir(id);
    }
}
