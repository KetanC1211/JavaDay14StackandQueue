package com.bridgelabz;

public class QueueMain {

	public static void main(String[] args) {
		QueueLinkedList list = new QueueLinkedList();
		list.enqueue(56);
		list.enqueue(30);
		list.enqueue(70);
		list.displayQueue();
	}
}

