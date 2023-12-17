package br.edu.infnet.appPlaylist.controller;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import br.edu.infnet.appPlaylist.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/listar")
    public List<Usuario> obterLista(){
        return (List<Usuario>) usuarioService.obterList();
    }

    @PostMapping(value = "/incluir")
    public void incluirUsuario(@RequestBody Usuario usuario){
        usuarioService.incluir(usuario);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id){
        usuarioService.excluir(id);
    }
}
