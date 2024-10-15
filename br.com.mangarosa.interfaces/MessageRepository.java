package br.com.mangarosa.interfaces;



import br.com.mangarosa.messagebroker.Message;
import java.util.List;

public interface MessageRepository {
    void saveMessage(String topic, Message message);  // Salva uma mensagem para um tópico
    List<Message> getMessages(String topic);          // Retorna as mensagens salvas para um tópico
}
