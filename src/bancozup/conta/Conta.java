package bancozup.conta;

import java.util.Random;

public abstract class Conta {
    private int numeroConta;
    private String titular;
    private String cpf;
    private double saldo;

    public Conta(String titular, String cpf) {
        this.numeroConta = gerarNumeroConta();
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    private int gerarNumeroConta() {
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int digito = random.nextInt(10);
            numero.append(digito);
        }
        return Integer.parseInt(numero.toString());
    }

    public abstract double calcularTaxa();

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido para depósito.");
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double taxa = calcularTaxa();
        //Como as taxas dos bancos nem o próprio banco entende, ela será aplicada por saque. Pq sim!
        if (valor + taxa > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
        this.saldo -= (valor + taxa);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\nConta: " +
                "\nNumero da Conta=" + numeroConta +
                "\nTitular='" + titular + '\'' +
                "\nCPF='" + cpf + '\'' +
                "\nSaldo=" + saldo;

    }
}