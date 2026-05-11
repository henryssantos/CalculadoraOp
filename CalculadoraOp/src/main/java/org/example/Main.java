package org.example;


public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Operacao soma = new Soma();
        Operacao multiplicacao = new Multiplicacao();
        Operacao potencia = new Potencia();

        System.out.println("===== CALCULADORA =====");

        calculadora.executar(soma, 10,5);
        calculadora.executar(multiplicacao, 10,5);
        calculadora.executar(potencia, 2,8);
    }
}
