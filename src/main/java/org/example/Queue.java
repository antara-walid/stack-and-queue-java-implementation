package org.example;

public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        // constructor
        private QueueNode(T data)
        {
            this.data= data;
        }

        @Override
        public String toString() {
            return "{" +
                    data +
                    '}';
        }
    }

    QueueNode<T> head ;
    QueueNode<T> tail ;

    public void add (T data)
    {
        QueueNode<T> current = head ;

        // create the new node
        QueueNode<T> newNode = new QueueNode<>(data);

        if(head == null)
        {
            head = newNode;
        }
        if(tail == null)
        {
            head.next = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public T remove()
    {
        T data = head.data;
        // delete head
        head = head.next;
        return data;
    }


}
