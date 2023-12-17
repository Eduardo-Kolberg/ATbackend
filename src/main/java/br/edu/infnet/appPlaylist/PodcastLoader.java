package br.edu.infnet.appPlaylist;

import br.edu.infnet.appPlaylist.model.domain.Podcast;
import br.edu.infnet.appPlaylist.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
@Order(3)
public class PodcastLoader implements ApplicationRunner {

    @Autowired
    PodcastService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("src/main/resources/FIles/Podcast");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            Podcast midia = new Podcast();
            midia.setNome(campos[0]);
            midia.setDuracao(Double.parseDouble(campos[1]));
            midia.setFavorita(Boolean.parseBoolean(campos[2]));
            midia.setTipo(campos[3]);
            midia.setEpisodio(Integer.parseInt(campos[4]));
            midia.setApresentadores(campos[5]);
            midia.setConvidado(campos[6]);
            service.incluir(midia);

            linha = leitura.readLine();
        }

        for(Podcast podcast : service.obterPodCast()) {
            System.out.println("[Podcast] " + podcast);
        }

        leitura.close();
    }
}
