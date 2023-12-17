package br.edu.infnet.appPlaylist.client;

import br.edu.infnet.appPlaylist.model.domain.Endereco;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class EnderecoClient {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Endereco pegarEnderecoPorCep(String cep) throws IOException {
        Endereco endereco;
        URL urlObjget = new URL("https://viacep.com.br/ws/" + cep + "/json/");
        HttpURLConnection connection1 = (HttpURLConnection) urlObjget.openConnection();
        connection1.setRequestMethod("GET");
        int responseCode = connection1.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection1.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            endereco = objectMapper.readValue(response.toString(), new TypeReference<Endereco>() {
            });
            return endereco;
        }
        return null;
    }
}
