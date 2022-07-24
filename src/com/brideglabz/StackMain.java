package com.brideglabz;

public class StackMain {
 public static void main(String[] args){
     // create Object of Implementing class
     StackUsingLinkedlist stack = new StackUsingLinkedlist();
     // insert Stack value
     stack.push(70);
     stack.push(30);
     stack.push(56);
     //printing current stack
     stack.display();
     //seeing top element
     System.out.println("\nTop element of stack is "+stack.peak());
     //deleting elements from top
     stack.pop();
     stack.display();
 }
}