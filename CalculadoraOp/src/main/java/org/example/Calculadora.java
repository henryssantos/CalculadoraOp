package org.example;

public class Calculadora {

    public void executar(Operacao operacao, double a,double b){
        double resultado = operacao.calcular(a,b);

        System.out.println("Operação  : " + operacao.getClass().getSimpleName());
        System.out.printf ("Valores   : %.2f  e  %.2f%n", a, b);
        System.out.printf ("Resultado : %.2f%n", resultado);
        System.out.println("----------------------------");

    }
}
