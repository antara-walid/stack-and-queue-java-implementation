package org.example;

public class Stack {

    // stackNode
    private static class StackNode {
        private int data;
        private StackNode next;

        // constructor
        private StackNode(int data)
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
    // 3.push()
    // 4.pop()

}
