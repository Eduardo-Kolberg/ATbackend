package br.edu.infnet.appPlaylist.utils;



public class TimeUtils {
    public static String getDuration(double duracao){
        int horas = (int) (duracao / 3600);
        int minutos = (int) ((duracao % 3600) / 60);
        int segundos = (int) (duracao % 60);
        return  String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
