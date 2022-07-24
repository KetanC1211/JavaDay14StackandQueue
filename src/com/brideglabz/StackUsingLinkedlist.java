package com.brideglabz;

import static java.lang.System.exit;

//Create Stack Using Linked list
class StackUsingLinkedlist {
	Node head;
	StackUsingLinkedlist()
	{
		this.head = null;
	}
	
	private class Node {
		int data; // integer data
		Node pointdown; // reference variable Node type
	}
	
	// Function to add element on top
	public void push(int x) {
		// create new node temp and allocate memory
		Node newNode = new Node();
		if (newNode == null) {
			System.out.print("Stack is Empty");
			return;
		}
		newNode.data = x;
		newNode.pointdown = head;
		head = newNode;
	}
	
	// Function to check if the stack is empty or not
	public boolean isEmpty()
	{
		return head == null;
	}

	// Function to see top element of Stack
	public int peak() {
		if (!isEmpty()) {
			return head.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// To delete top element of stack
	public void pop() {
		// check for stack underflow
		if (head == null) {
			System.out.print("Stack is Empty");
			return;
		}
		head = (head).pointdown;
	}

	public void display() {
		if (head == null) {
			System.out.printf("Stack is Empty");
			exit(1);
		}
		else {
			Node tempNode = head;
			while (tempNode != null) {
				// print node data
				System.out.printf("%d->", tempNode.data);
				tempNode = tempNode.pointdown;
			}
		}
	}
}
