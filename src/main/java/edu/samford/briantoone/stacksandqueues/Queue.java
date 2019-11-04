package edu.samford.briantoone.stacksandqueues;

/**
 * Interface for a FIFO data structure.
 * @author kartoone
 */
public interface Queue<T> {
    public void enqueue(T data);
    public T dequeue();
    public T front();
    public boolean isEmpty();
    public int size();
}
