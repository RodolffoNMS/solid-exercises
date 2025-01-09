package ocp.correto.main;

import ocp.correto.calculadora.Calculadora;
import ocp.correto.calculadora.operacoes.Multiplicacao;
import ocp.correto.calculadora.operacoes.Soma;
import ocp.correto.calculadora.operacoes.Subtracao;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadoraSoma = new Calculadora(new Soma());
        Calculadora calculadoraSubtracao = new Calculadora(new Subtracao());
        Calculadora calculadoraMultiplicacao = new Calculadora(new Multiplicacao());

        //Podemos simplesmente "chamar" a função dentro de um println:
        System.out.println(calculadoraSoma.calcular(5, 3));

        //Podemos armazenar o resultado (Aprendi isso hoje!):
        String resultadoSubtracao = String.format("Resultado da subtração: %.2f%n", calculadoraSubtracao.calcular(5, 3));
        System.out.println(resultadoSubtracao);

        //E claro, usar melhor nosso println:
        System.out.printf("Resultado da multiplicação: %.2f%n", calculadoraMultiplicacao.calcular(5, 3));
    }
}
