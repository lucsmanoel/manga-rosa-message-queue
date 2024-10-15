package br.com.mangarosa.messagebroker.consumers;


import br.com.mangarosa.messagebroker.topics.LongDistanceItemsTopic;
import br.com.mangarosa.messagebroker.Message;

public class LongDistanceConsumer {
    private LongDistanceItemsTopic topic;

    public LongDistanceConsumer(LongDistanceItemsTopic topic) {
        this.topic = topic;
    }

    public void consume() {
        Message message = topic.consume();
        if (message != null && !message.isExpired()) {
            System.out.println("Consumed: " + message.getContent());
        }
    }
}
