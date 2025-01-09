package ocp.correto.calculadora;

import ocp.correto.calculadora.operacoes.Operacao;

public class Calculadora{
    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }
    public double calcular(double a, double b) {
        return operacao.calcular(a, b);
    }


}
