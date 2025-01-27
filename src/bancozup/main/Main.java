package bancozup.main;

import bancozup.comunicacao.NotificacaoEmail;
import bancozup.comunicacao.NotificacaoSMS;
import bancozup.conta.ContaCorrente;
import bancozup.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

    ContaCorrente conta1 = new ContaCorrente("Enzo Schildkröte ", "123.456.789-00");
    ContaPoupanca conta2 = new ContaPoupanca("Yekaterina Nacktschnecke ", "987.654.321-00");
    NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
    NotificacaoSMS notificacaoSMS = new NotificacaoSMS();

    System.out.println(conta1);
    System.out.println(conta2);

    conta1.depositar(1000.0);
    System.out.println("Depósito realizado com sucesso!");
    System.out.println("\nSaldo atualizado da conta de Enzo: " + conta1.getSaldo());
    conta1.sacar(200.0);
    System.out.println("Saque realizado com sucesso!");
    System.out.println("\nSaldo atualizado da conta de Enzo: " + conta1.getSaldo());
    notificacaoEmail.enviar("Seu depósito foi realizado com sucesso!", "enzo@email.com");


    conta2.depositar(300.0);
    System.out.println("Depósito realizado com sucesso!");
    System.out.println("\nSaldo atualizado da conta de Yekaterina: " + conta2.getSaldo());
    conta2.sacar(200.0);
    System.out.println("Saque realizado com sucesso!");
    System.out.println("\nSaldo atualizado da conta de Yekaterina: " + conta2.getSaldo());
    notificacaoSMS.enviar("Seu saldo foi atualizado.", "+5511999999999");


    }
}
