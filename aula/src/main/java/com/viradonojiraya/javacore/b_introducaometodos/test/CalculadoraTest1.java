package com.viradonojiraya.javacore.b_introducaometodos.test;

import com.viradonojiraya.javacore.b_introducaometodos.dominio.Calculadora;

public class CalculadoraTest1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.n1 = 10;
        calculadora.n2 = 10;

        calculadora.soma();
        calculadora.subtracao();
        calculadora.divisao();
        calculadora.multiplicacao();
    }
}
