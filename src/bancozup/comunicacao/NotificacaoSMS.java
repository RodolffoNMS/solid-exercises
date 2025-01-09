package bancozup.comunicacao;

import bancozup.validador.Validador;

public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviar(String mensagem, String destinatario) {
        if (!Validador.validarTelefone(destinatario)) {
            throw new IllegalArgumentException("Telefone inválido.");
        }
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}