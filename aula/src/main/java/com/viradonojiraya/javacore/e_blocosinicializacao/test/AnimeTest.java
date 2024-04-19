package com.viradonojiraya.javacore.e_blocosinicializacao.test;

import com.viradonojiraya.javacore.e_blocosinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        int[] eps = anime.getEp();
        
        for (int i = 0; i < anime.getEp().length; i++){
            System.out.println(eps[i]);
        }
        
    }
}
