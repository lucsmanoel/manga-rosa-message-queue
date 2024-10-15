package br.com.mangarosa.datastructures.interfaces.impl;

public class QueueNode<T> {
    private T data;           // Armazena o dado do nó
    private QueueNode<T> next; // Referência para o próximo nó

    public QueueNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    public QueueNode<T> getNext() {
        return next;
    }
}
