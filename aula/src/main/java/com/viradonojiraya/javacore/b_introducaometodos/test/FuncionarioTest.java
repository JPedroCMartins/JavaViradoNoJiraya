package com.viradonojiraya.javacore.b_introducaometodos.test;

import com.viradonojiraya.javacore.b_introducaometodos.dominio.Funcionarios;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        
        double[] salario = {4000.00, 5000.00, 3999.00};
        
        funcionario.setNome("José");
        funcionario.setIdade(24);
        funcionario.setSalario(salario);

        funcionario.imprimir();
        
    }
}
