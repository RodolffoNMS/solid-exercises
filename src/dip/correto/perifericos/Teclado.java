package dip.correto.perifericos;

public class Teclado implements DispositivoEntrada{
    @Override
    public void usar() {
        System.out.println("Digitando...");
    }
}