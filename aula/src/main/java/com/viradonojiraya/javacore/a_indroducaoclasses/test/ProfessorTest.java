package com.viradonojiraya.javacore.a_indroducaoclasses.test;

import com.viradonojiraya.javacore.a_indroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
		Professor prof = new Professor();
		
		prof.nome = "Julio";
		prof.sexo = 'M';
		prof.idade = 26;
		
		System.out.println(prof.nome + " " + prof.idade + " " + prof.sexo);
	}
	
}
