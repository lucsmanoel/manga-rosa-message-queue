package br.com.mangarosa.messagebroker.consumers;



import br.com.mangarosa.messagebroker.topics.FastDeliveryItemsTopic;
import br.com.mangarosa.messagebroker.Message;

public class FastDeliveryConsumer {
    private FastDeliveryItemsTopic topic;

    public FastDeliveryConsumer(FastDeliveryItemsTopic topic) {
        this.topic = topic;
    }

    public void consume() {
        Message message = topic.consume();
        if (message != null && !message.isExpired()) {
            System.out.println("Consumed: " + message.getContent());
        }
    }
}
