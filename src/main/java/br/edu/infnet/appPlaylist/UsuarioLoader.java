package br.edu.infnet.appPlaylist;


import br.edu.infnet.appPlaylist.model.domain.Endereco;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import br.edu.infnet.appPlaylist.service.EnderecoService;
import br.edu.infnet.appPlaylist.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
@Order(4)
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("src/main/resources/FIles/Usuarios.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            Usuario usuario = new Usuario();
            usuario.setNome(campos[0]);
            usuario.setCpf(campos[1]);
            usuario.setEmail(campos[2]);
            Endereco endereco = enderecoService.buscarCep(campos[3]);
            usuario.setEndereco(endereco);
            usuarioService.incluir(usuario);
            linha = leitura.readLine();
        }

        for(Usuario usuario : usuarioService.obterList()) {
            System.out.println("[Usuário] " + usuario);
        }

        leitura.close();
    }
}
