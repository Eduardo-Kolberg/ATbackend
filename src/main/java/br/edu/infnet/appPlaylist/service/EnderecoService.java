package br.edu.infnet.appPlaylist.service;

import br.edu.infnet.appPlaylist.Repositories.EnderecoRepository;
import br.edu.infnet.appPlaylist.client.EnderecoClient;
import br.edu.infnet.appPlaylist.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collection;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    EnderecoClient enderecoClient;

    public Endereco buscarCep(String cep) throws IOException {
        return enderecoClient.pegarEnderecoPorCep(cep);

    }

    public Collection<Endereco> obterEndereco(){
        return (Collection<Endereco>)enderecoRepository.findAll();
    }

    public void excluir(Integer id){
        enderecoRepository.deleteById(id);
    }
}
