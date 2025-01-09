package isp.correto.main;

import isp.correto.funcionarios.Atendente;
import isp.correto.funcionarios.Desenvolvedor;
import isp.correto.funcionarios.Escriturario;
import isp.correto.funcionarios.Programador;

public class Main {
    public static void main(String[] args) {
        Programador desenvolvedor = new Desenvolvedor();
        Atendente atendente = new Escriturario();

        atendente.atenderCliente();
        desenvolvedor.programar();

    }
}