package ocp.correto.calculadora.operacoes;

public class Multiplicacao implements Operacao{

    @Override
    public double calcular( double operando1, double operando2){
        return operando1 * operando2;
    }
}
