package main.linkedlists;

import java.util.LinkedHashMap;
import java.util.Map;

// Java program to merge a linked list into another at
// alternate positions
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	/* Inserts a new Node at front of the list. */
	void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Main function that inserts nodes of linked list q into p at
	// alternate positions. Since head of first list never changes
	// and head of second list/ may change, we need single pointer
	// for first list and double pointer for second list.
	void merge(LinkedList q)
	{
		Node p_curr = head, q_curr = q.head;
		Node p_next, q_next;

		// While there are available positions in p;
		while (p_curr != null && q_curr != null) {

			// Save next pointers
			p_next = p_curr.next;
			q_next = q_curr.next;

			// make q_curr as next of p_curr
			q_curr.next = p_next; // change next pointer of q_curr
			p_curr.next = q_curr; // change next pointer of p_curr

			// update current pointers for next iteration
			p_curr = p_next;
			q_curr = q_next;
		}
		Node q_last = head;
		while(q_last != null){
			if(q_last.next == null){
				break;
			}
			q_last = q_last.next;
		}



			while(q_curr != null) {
				q_last.next = q_curr;
				q_last = q_last.next;
				q_curr = q_curr.next;
			}


			while(p_curr != null ) {
				q_last.next = p_curr;
				p_curr = p_curr.next;
			}

		q.head = q_curr;
	}

	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
		System.out.print(temp.data+" ");
		temp = temp.next;
		}
		System.out.println();
	}

	/* Driver program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist1 = new LinkedList();
		LinkedList llist2 = new LinkedList();
		llist1.push(3);
		llist1.push(2);
		llist1.push(1);

		System.out.println("First Linked List:");
		llist1.printList();

		llist2.push(8);
		llist2.push(7);
		llist2.push(6);
		llist2.push(5);
		llist2.push(4);

		System.out.println("Second Linked List:");

		llist1.merge(llist2);

		System.out.println("Modified first linked list:");
		llist1.printList();

		System.out.println("Modified second linked list:");
		llist2.printList();
	}


	//
	void firstOccurenceOfChar(String s){

		Map<Character, Integer> countMap = new LinkedHashMap();

		for(int i=0;i<s.length();i++){
			if(countMap.get(s.charAt(i)) != null  || countMap.get(s.charAt(i)) ==0){
				countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
			}else {
				countMap.put(s.charAt(i), 1);

			}

		}
		// printing least occrence charAt


		for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
			if(entry.getValue() ==1){

				System.out.println("non repeating char " + entry.getKey());
				break;
			}

		}


	}




} /* This code is contributed by Rajat Mishra */
