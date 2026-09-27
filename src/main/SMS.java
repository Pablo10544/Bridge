package main;

public class SMS implements CanalEnvio {

    @Override
    public String enviar(String mensagem) {
        return "Enviando SMS: " + mensagem;
    }
}