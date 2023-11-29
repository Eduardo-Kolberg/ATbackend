package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.UsuarioRepository;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    public void incluir(Usuario usuario){
        usuarioRepository.save(usuario);

    }

    public Collection<Usuario> obterList(){
        return (Collection<Usuario>)usuarioRepository.findAll();

    }

}
