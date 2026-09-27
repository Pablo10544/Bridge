package main;

public class NotificacaoUrgente extends Notificacao {

    public NotificacaoUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public String enviar(String mensagem) {
        return canal.enviar("[URGENTE] " + mensagem);
    }
}