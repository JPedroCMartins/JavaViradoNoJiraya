package com.viradonojiraya.javacore.b_introducaometodos.dominio;

public class Funcionarios {
    private String nome = null;
    private int idade = 0;
    private double[] salario = null;
    private double media = 0;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null){
            return;
        }
        for (double i: salario){
            System.out.println(i);
        }
        System.out.println("-------------------");
        tirarMedia();
    }
    public void tirarMedia(){
        if (salario == null){
            return;
        }
        for (double i: salario){
            media += i;
        }
        media /= salario.length;
        System.out.println("A média do salario é: " + media);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSalario(double[] salario){
        this.salario = salario;
    }
}
