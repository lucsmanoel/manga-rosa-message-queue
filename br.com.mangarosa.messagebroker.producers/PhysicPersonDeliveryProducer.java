package br.com.mangarosa.messagebroker.producers;



import br.com.mangarosa.messagebroker.Message;
import br.com.mangarosa.messagebroker.topics.FastDeliveryItemsTopic;
import java.time.Duration;

public class PhysicPersonDeliveryProducer {
    private FastDeliveryItemsTopic topic;

    public PhysicPersonDeliveryProducer(FastDeliveryItemsTopic topic) {
        this.topic = topic;
    }

    public void produce(String content) {
        Message message = new Message(content, Duration.ofMinutes(45));
        topic.publish(message);
    }
}

