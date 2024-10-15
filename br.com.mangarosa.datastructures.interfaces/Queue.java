package br.com.mangarosa.datastructures.interfaces;



public interface Queue<T> {
    void enqueue(T element);  // Adiciona um elemento à fila
    T dequeue();              // Remove e retorna o elemento do início da fila
    T peek();                 // Retorna o elemento no início da fila sem remover
    boolean isEmpty();        // Verifica se a fila está vazia
}
