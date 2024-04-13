package com.viradonojiraya.javacore.a_indroducaoclasses.test;
import com.viradonojiraya.javacore.a_indroducaoclasses.dominio.Estudante;
public class EstudanteTest {
    public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Joãozinho";
		estudante.idade = 18;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);	
		System.out.println(estudante.sexo);
	}
}
