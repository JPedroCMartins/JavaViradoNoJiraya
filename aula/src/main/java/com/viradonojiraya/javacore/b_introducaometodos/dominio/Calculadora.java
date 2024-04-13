package com.viradonojiraya.javacore.b_introducaometodos.dominio;

public class Calculadora {
    public double n1;
    public double n2;

    public void soma(){
        System.out.println(this.n1 + this.n2);
    }
    public void subtracao(){
        System.out.println(this.n1 - this.n2);
    }
    public void multiplicacao(){
        System.out.println(this.n1 * this.n2);
    }   
    public void divisao(){
        System.out.println(this.n1 / this.n2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero: numeros){
            soma = soma + numero;
        }
        System.out.println("A Soma de todos os numeros é: " + soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int numero: numeros){
            soma = soma + numero;
        }
        System.out.println(soma);
    }
}
