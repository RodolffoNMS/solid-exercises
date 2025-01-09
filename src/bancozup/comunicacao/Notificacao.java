package bancozup.comunicacao;

public interface Notificacao {
    void enviar(String mensagem, String destinatario);
}