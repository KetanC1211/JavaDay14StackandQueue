package com.bridgelabz;

public class QueueLinkedList {
	private Node head;
    private Node tail;
    private int size;

    // Represent node of singly Linked-List    
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    
    //initial size Zero
    public QueueLinkedList() {
        this.size = 0;
    }

    //To print elements in List
    public void displayQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    //To add element from head side    
    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    
    //Add elements from tail side    
    public void enqueue(int val) {
        if (tail == null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Delete first element of linked List    
    public int dequeue() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //Display Size of linked List
    public void displayQueueSize() {
    	System.out.println("Size of list is "+size);
    }
}
