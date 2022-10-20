package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // testing the stack class
//        Stack<Integer> stack = new Stack<>();
////        for(int i = 0 ; i < 5 ; i++)
////        {
////            stack.push(i);
////        }
//        stack.print();
//
//        System.out.println("******");
//
//        //System.out.println(stack.peek() );
//
//        System.out.println(stack.isEmpty());
//
//        System.out.println("******");
//
//        int val = stack.pop();
//        System.out.println("the value is" + val);
//
//        stack.print();

        // testing the Queue class

        Queue<Integer> queue = new Queue<>();
        for(int i = 0 ; i < 5 ; i++)
        {
            queue.add(i);
        }
        queue.print();


        System.out.println("*********");
        System.out.println(queue.remove());
        System.out.println("*********");
        queue.print();
    }


}
