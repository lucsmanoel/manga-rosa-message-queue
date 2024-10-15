package br.com.mangarosa.messagebroker.producers;



import br.com.mangarosa.messagebroker.Message;
import br.com.mangarosa.messagebroker.topics.LongDistanceItemsTopic;
import java.time.Duration;

public class FastDeliveryProducer {
    private LongDistanceItemsTopic topic;

    public FastDeliveryProducer(LongDistanceItemsTopic topic) {
        this.topic = topic;
    }

    public void produce(String content) {
        Message message = new Message(content, Duration.ofHours(1));
        topic.publish(message);
    }
}

