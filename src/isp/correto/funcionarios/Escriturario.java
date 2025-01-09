package isp.correto.funcionarios;

//Por se tratar de um banco, geralmente os "atendentes" possuem esse cargo em algumas instituições como Caixa e BB.
public class Escriturario implements Atendente {
    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente...");

    }
}