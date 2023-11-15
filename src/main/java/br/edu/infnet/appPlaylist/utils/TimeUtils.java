package br.edu.infnet.appPlaylist.utils;

import java.time.LocalTime;

public class TimeUtils {
    public static LocalTime getDuration(double duracao){
        int horas = (int) (duracao / 3600);
        int minutos = (int) ((duracao % 3600) / 60);
        int segundos = (int) (duracao % 60);
        return LocalTime.of(horas,minutos,segundos);
    }
}
