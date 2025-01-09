package bancozup.comunicacao;

import bancozup.validador.Validador;

public class NotificacaoEmail implements Notificacao {
    @Override
    public void enviar(String mensagem, String destinatario) {
        if (!Validador.validarEmail(destinatario)) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}