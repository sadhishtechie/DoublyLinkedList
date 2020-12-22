
public class DLL {

	public Node head;
	public Node tail;
	public int length;

	public DLL() {

		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public void InsertAtBeg(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			tail = newnode;
		} else {
			head.prev = newnode;
		}
		newnode.next = head;
		head = newnode;
		length++;
	}

	public void InsertAtEnd(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			head = newnode;
		} else {
			tail.next = newnode;
			newnode.prev = tail;
		}
		tail = newnode;
		length++;
	}

	public boolean isEmpty() {

		return length == 0;
	}

	public void printall() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void printallrev() {
		Node n = tail;
		while (n.prev != null) {
			System.out.print(n.data + "-->");
			n = n.prev;
		}
		System.out.println(n.data);
	}

	public void insertAt(int index, int data) {

		Node newnode = new Node(data);

		if (index == 0) {

			head.prev = newnode;
			newnode.next = head;
			head = newnode;
			// length++;

		} else {

			Node n = head;
			Node p = n.prev;

			for (int i = 0; i < index - 1; i++) {
				n = n.next;
				p = n.prev;
			}
			// Node p = n.prev;

			newnode.next = n;
			// n.next = node;
			n.prev = newnode;
			newnode.prev = p;
			p.next = newnode;

			// length++;
		}
		length++;
	}

	public void RemoveAtBeg() {
		// Node newnode = new Node(data);
		if (isEmpty()) {
			System.out.println("Doubly linked list is empty");
		} else {
			Node n = head;

			//newnode.next = head;
			head = n.next;
			head.prev=null;
			length--;
		}
	}
	public void RemoveAtEnd() {
		// Node newnode = new Node(data);
		if (isEmpty()) {
			System.out.println("Doubly linked list is empty");
		} else {
			Node n = tail;

			//newnode.next = head;
			tail = n.prev;
			tail.next=null;
			length--;
		}
	}
}
