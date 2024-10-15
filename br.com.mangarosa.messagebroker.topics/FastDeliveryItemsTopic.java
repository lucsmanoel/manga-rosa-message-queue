package br.com.mangarosa.messagebroker.topics;


import br.com.mangarosa.messagebroker.Message;
import br.com.mangarosa.datastructures.interfaces.impl.LinkedQueue;

public class FastDeliveryItemsTopic {
    private LinkedQueue<Message> queue = new LinkedQueue<>();

    public void publish(Message message) {
        queue.enqueue(message);
    }

    public Message consume() {
        return queue.dequeue();
    }
}
