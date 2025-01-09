package dip.correto.computador;

import dip.correto.perifericos.DispositivoEntrada;
import dip.correto.perifericos.DispositivoSaida;

public class Computador{
    private DispositivoEntrada dispositivoEntrada;
    private DispositivoSaida dispositivoSaida;

    public Computador(DispositivoEntrada dispositivoEntrada, DispositivoSaida dispositivoSaida) {
        this.dispositivoEntrada = dispositivoEntrada;
        this.dispositivoSaida = dispositivoSaida;
    }

    public void usarDispositivoEntrada() {
        dispositivoEntrada.usar();
    }

    public void usarDispositivoSaida() {
        if (dispositivoSaida != null) {
            dispositivoSaida.exibirDados();
        } else {
            System.out.println("Nenhum dispositivo de saída conectado.");
        }
    }
}
