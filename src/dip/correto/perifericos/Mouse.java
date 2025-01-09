package dip.correto.perifericos;

public class Mouse implements DispositivoEntrada{
    @Override
    public void usar() {
        System.out.println("Controlando Mouse...");
    }
}
