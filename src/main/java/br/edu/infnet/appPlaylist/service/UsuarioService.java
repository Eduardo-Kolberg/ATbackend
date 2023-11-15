package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.model.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    private Map<String, Usuario> usuarioMap = new HashMap<>();

    public void incluir(Usuario usuario){
        usuarioMap.put(usuario.getUID(),usuario);
    }

    public Map<String,Usuario> obterMap(){
        return usuarioMap;
    }

}
