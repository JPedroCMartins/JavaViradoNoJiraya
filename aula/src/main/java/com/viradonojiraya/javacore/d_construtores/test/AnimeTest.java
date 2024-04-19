package com.viradonojiraya.javacore.d_construtores.test;

import com.viradonojiraya.javacore.d_construtores.dominio.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		Anime anime = new Anime("Naruto", "TV", 500, "Aventura", "Pierrot");
	
		anime.imprime();
		
	}
}