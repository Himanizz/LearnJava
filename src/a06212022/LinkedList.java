package a06212022;

public class LinkedList {
 Node head; // head of list
 	static class Node {
		int data;
		Node next;
		Node(int d){
		data = d;
		next = null;
		 }
 	}
 	public static LinkedList insert(LinkedList list, int data) {
 		Node new_node = new Node(data);
 		if (list.head==null) {
 			list.head = new_node;
 		}
 		else {
 			Node last = list.head;
 			while(last.next!= null) {
 				last = last.next;
 					}
 			last.next = new_node;
 				}
 		return list;
 			}
 	public static void printList(LinkedList list) {
 		Node currNode = list.head;
 		System.out.println("Linked List: ");
 		while (currNode!= null) {
 			System.out.println(currNode.data + " ");
 			currNode = currNode.next;
 		}
 	}
    public static LinkedList deleteByKey(LinkedList list, int key){
// Store head node
Node currNode = list.head, prev = null;
	if (currNode != null && currNode.data == key) {
		list.head = currNode.next; // Changed head
		System.out.println(key + " found and deleted");
	}
	return list;
 }
 	public static void main(String[] args) {
 		LinkedList list = new LinkedList();
 	      list = insert(list, 1);
 	      list = insert(list, 2);
 	      list = insert(list, 3);
 	      list = insert(list, 4);
 	      list = insert(list, 5);
 	      list = insert(list, 6);
 	      list = insert(list, 7);
 	      list = insert(list, 8);
 	      printList(list);
 	}
 }
		


