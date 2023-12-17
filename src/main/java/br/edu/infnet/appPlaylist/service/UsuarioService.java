package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.UsuarioRepository;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collection;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EnderecoService enderecoService;

    public void incluir(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void incluir(Usuario usuario,String cep) throws IOException {
        usuario.setEndereco(enderecoService.buscarCep(cep));
        usuarioRepository.save(usuario);
    }

    public Collection<Usuario> obterList(){
        return (Collection<Usuario>)usuarioRepository.findAll();
    }

    public void excluir(Integer id){
        usuarioRepository.deleteById(id);
    }

}
