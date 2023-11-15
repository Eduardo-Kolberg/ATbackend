package br.edu.infnet.appPlaylist.service;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class ListService {

    public static <T> Map<String,T> incluir(Map<String,T> map, T object){
        map.put(object.getClass().toString(),object);
        return map;
    }

    public static <T> Map<String,T> obterLista(Map<String,T> map, T object){
        return map;
    }
}
