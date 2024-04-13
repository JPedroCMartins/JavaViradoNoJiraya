package com.viradonojiraya.javacore.a_indroducaoclasses.test;
import com.viradonojiraya.javacore.a_indroducaoclasses.dominio.Carro;
public class CarroTest {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.nome = "Carro Modelo 1";
        car1.modelo = "111";
        car1.ano = 2010;

        car2.nome = "Carro Modelo 2";
        car2.modelo = "222";
        car2.ano = 2020;
        System.out.println("");
        System.out.println(car1.nome + " " + car1.modelo + " " + car1.ano);
        System.out.println(car2.nome + " " + car2.modelo + " " + car2.ano);
    }
}
