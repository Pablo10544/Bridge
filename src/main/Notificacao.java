package main;
public class Notificacao {

    protected CanalEnvio canal;

    public Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    public String enviar(String mensagem) {
        return canal.enviar(mensagem);
    }
}