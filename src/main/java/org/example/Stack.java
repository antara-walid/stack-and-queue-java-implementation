package org.example;

public class Stack<T> {

    // stackNode
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        // constructor
        private StackNode(T data)
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

    private StackNode<T> top;

    // Stack methods
    // 1.isEmpty()
    public boolean isEmpty()
    {
        return top == null;
    }

    // 2.peek()
    public T peek()
    {
        // check if stack is empty in this case throw exception
        if(top == null )
        {
            throw new RuntimeException("Stack is empty");
        }

        return  top.data;

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
        if(top == null )
        {
            throw new RuntimeException("Stack is empty");
        }
        T data =  top.data;
        top = top.next; // garbage collector will remove the unlinked node
        return data;
    }

    public void print()
    {
        StackNode<T> current = top;
        while(current != null)
        {
            System.out.println(current );
            current = current.next;

        }
    }

}
