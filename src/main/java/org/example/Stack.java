package org.example;

public class Stack<T> {

    // stackNode
    private static class StackNode<T> {
        private T data;
        private StackNode next;

        // constructor
        private StackNode(T data)
        {
            this.data= data;
        }
    }

    private StackNode top;

    // Stack methods
    // 1.isEmpty()
    public boolean isEmpty()
    {
        return false;
    }

    // 2.peek()
    public T peek()
    {
        // check if stack is empty in this case throw exception
        if(top == null )
        {
            throw new RuntimeException("Stack is empty");
        }

        return (T) top.data;

    }
    // 3.push()

    public void push(T data)
    {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }
    // 4.pop()

    public T pop()
    {
        T data = (T) top.data;
        top = top.next; // garbage collector will remove the unlinked node
        return data;
    }

}
