package dip.correto.main;

import dip.correto.computador.Computador;
import dip.correto.perifericos.*;

public class Main {
    public static void main(String[] args) {
        DispositivoEntrada teclado = new Teclado();
        DispositivoSaida impressora = new Impressora();
        Computador computadorComTeclado = new Computador(teclado, impressora);
        computadorComTeclado.usarDispositivoEntrada();
        computadorComTeclado.usarDispositivoSaida();

        DispositivoEntrada mouse = new Mouse();
        Computador computadorComMouse = new Computador(mouse, null);
        computadorComMouse.usarDispositivoEntrada();
        computadorComMouse.usarDispositivoSaida();
    }
}
