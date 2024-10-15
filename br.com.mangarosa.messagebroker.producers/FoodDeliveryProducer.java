package br.com.mangarosa.messagebroker.producers;


import br.com.mangarosa.messagebroker.Message;
import br.com.mangarosa.messagebroker.topics.FastDeliveryItemsTopic;
import java.time.Duration;

public class FoodDeliveryProducer {
    private FastDeliveryItemsTopic topic;

    public FoodDeliveryProducer(FastDeliveryItemsTopic topic) {
        this.topic = topic;
    }

    public void produce(String content) {
        Message message = new Message(content, Duration.ofMinutes(30));
        topic.publish(message);
    }
}
