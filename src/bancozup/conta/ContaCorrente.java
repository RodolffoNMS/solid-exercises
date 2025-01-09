package bancozup.conta;

public class ContaCorrente extends Conta{
    public ContaCorrente(String cpf, String titular){
        super(cpf, titular);

    }

    @Override
    public double calcularTaxa() {
        return 5.0;
    }
}
