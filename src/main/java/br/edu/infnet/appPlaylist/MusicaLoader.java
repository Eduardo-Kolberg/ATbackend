package br.edu.infnet.appPlaylist;

import br.edu.infnet.appPlaylist.model.domain.Musica;
import br.edu.infnet.appPlaylist.model.domain.Usuario;
import br.edu.infnet.appPlaylist.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.UUID;

@Component
public class MusicaLoader implements ApplicationRunner {

    @Autowired
    MusicaService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("src/main/resources/FIles/Musicas.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            Musica musica = new Musica();
            musica.setNome(campos[0]);
            musica.setDuracao(Double.parseDouble(campos[1]));
            musica.setFavorita(Boolean.parseBoolean(campos[2]));
            musica.setTipo(campos[3]);
            musica.setEstilo(campos[4]);
            musica.setNomeArtista(campos[5]);
            musica.setId(UUID.randomUUID().toString());
            service.incluir(musica);

            linha = leitura.readLine();
        }

        for(Musica musica : service.obterMap().values()) {
            System.out.println("[Musica] " + musica);
        }

        leitura.close();
    }
}
