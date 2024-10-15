package br.com.mangarosa.datastructures.interfaces.impl;

import br.com.mangarosa.datastructures.interfaces.Queue;

public class LinkedQueue<T> implements Queue<T> {
    private QueueNode<T> front;  // Primeiro nó da fila
    private QueueNode<T> rear;   // Último nó da fila
    private int size;            // Tamanho da fila

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    @Override
    public void enqueue(T element) {
        QueueNode<T> newNode = new QueueNode<>(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return front.getData();
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }
}
