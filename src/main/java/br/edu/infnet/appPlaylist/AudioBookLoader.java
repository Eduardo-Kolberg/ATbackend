package br.edu.infnet.appPlaylist;

import br.edu.infnet.appPlaylist.model.domain.AudioBook;
import br.edu.infnet.appPlaylist.model.domain.Podcast;
import br.edu.infnet.appPlaylist.service.AudioBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.UUID;

@Component
@Order(1)
public class AudioBookLoader implements ApplicationRunner {

    @Autowired
    AudioBookService service;

    @Override

    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("src/main/resources/FIles/AudioBooks.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            AudioBook midia = new AudioBook();
            midia.setNome(campos[0]);
            midia.setDuracao(Double.parseDouble(campos[1]));
            midia.setFavorita(Boolean.parseBoolean(campos[2]));
            midia.setTipo(campos[3]);
            midia.setAutor(campos[4]);
            midia.setNomeSerie(campos[5]);
            midia.setVolume(campos[6]);
            service.incluir(midia);

            linha = leitura.readLine();
        }

        for(AudioBook audioBook : service.obterMap()) {
            System.out.println("[AudioBook] " + audioBook);
        }

        leitura.close();
    }
}
