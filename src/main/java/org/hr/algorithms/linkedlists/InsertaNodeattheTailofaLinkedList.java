package org.hr.algorithms.linkedlists;

import java.io.IOException;
import java.util.Scanner;

public class InsertaNodeattheTailofaLinkedList {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;

		public SinglyLinkedList() {
			this.head = null;
		}

	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
		while (node != null) {
			System.out.println(String.valueOf(node.data));
			node = node.next;
		}
	}

	// Complete the insertNodeAtTail function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		// new tail
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		node.next = null;

		SinglyLinkedListNode tail = getTail(head);
		if (tail == null) {
			return node;
		} else {
			tail.next = node;
			return head;
		}
	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		node.next = head;
		return node;
	}

	static SinglyLinkedListNode getTail(SinglyLinkedListNode head) {
		if (head == null) {
			return null;
		} else if (head.next == null) {
			return head;
		}

		return getTail(head.next);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		SinglyLinkedList llist = new SinglyLinkedList();

		int llistCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
			llist.head = llist_head;
		}

		printSinglyLinkedList(llist.head);
		scanner.close();
	}
}
