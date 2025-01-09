package srp.correto.main;

import srp.correto.EnviarPorEmail;
import srp.correto.RelatorioFinanceiro;

public class Main {
    public static void main(String[] args) {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        EnviarPorEmail email = new EnviarPorEmail();

        relatorio.imprimeRelatorio();
        email.enviaEmail();
    }
}