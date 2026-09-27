package main;

public class Email implements CanalEnvio {

    @Override
    public String enviar(String mensagem) {
        return "Enviando e-mail: " + mensagem;
    }
}