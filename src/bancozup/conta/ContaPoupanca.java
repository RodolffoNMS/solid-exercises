package bancozup.conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cpf, String titular){
        super(cpf, titular);

    }

    @Override
    public double calcularTaxa() {
        return 2.0;
    }

}
