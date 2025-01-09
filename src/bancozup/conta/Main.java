package bancozup.conta;

public class Main {
    public static void main(String[] args) {

    ContaCorrente conta1 = new ContaCorrente("João Silva", "123.456.789-00");
    ContaCorrente conta2 = new ContaCorrente("Maria Oliveira", "987.654.321-00");

    System.out.println(conta1);
    System.out.println(conta2);

    conta1.depositar(1000.0);
    conta1.sacar(200.0);

    System.out.println("\nSaldo atualizado da conta de João: " + conta1.getSaldo());

    }
}
