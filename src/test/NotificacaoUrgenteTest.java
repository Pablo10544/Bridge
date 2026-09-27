package test;

import main.CanalEnvio;
import main.Notificacao;
import main.NotificacaoUrgente;
import main.SMS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificacaoUrgenteTest {

    @Test
    void deveAdicionarPrefixoDeUrgencia() {
        CanalEnvio canal = new SMS();
        Notificacao notificacao = new NotificacaoUrgente(canal);

        assertEquals(notificacao.enviar("Servidor indisponível"),"Enviando SMS: [URGENTE] Servidor indisponível");


    }
}
