package com.viradonojiraya.javacore.b_introducaometodos.test;

import com.viradonojiraya.javacore.b_introducaometodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6,7,8,9,1000};
    
        calculadora.somaArray(numeros);  
        calculadora.somaVarArgs(numeros);  
    }
}
