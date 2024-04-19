package com.viradonojiraya.javacore.c_sobrecargametodos.test;

import com.viradonojiraya.javacore.c_sobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        anime.init("Naruto Classico", "TV", 500);
        anime.init("Naruto Classico", "TV", 500, "Aventura");
        anime.imprime();
    }
}
