package test;

import main.CanalEnvio;
import main.Email;
import main.Notificacao;
import main.NotificacaoSimples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NotificacaoTest {

    @Test
    void deveEnviarMensagemPeloCanalEscolhido() {
        CanalEnvio canal = new Email();
        Notificacao notificacao = new NotificacaoSimples(canal);

       assertEquals(notificacao.enviar("Pedido aprovado"),"Enviando e-mail: Pedido aprovado");

    }
}