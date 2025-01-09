package dip.correto.perifericos;

public class Impressora implements DispositivoSaida{
    @Override
    public void exibirDados() {
        System.out.println("Imprimindo...");
    }
}
