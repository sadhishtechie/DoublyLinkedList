
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL dll = new DLL();
		dll.InsertAtBeg(50);
		dll.InsertAtBeg(100);
		dll.InsertAtBeg(150);
		//dll.printall();
		System.out.println("------Forward direction-------");
		dll.InsertAtEnd(200);
		dll.InsertAtEnd(250);
		dll.insertAt(4, 101);
		dll.printall();
		System.out.println("------Reverse direction-------");
		dll.printallrev();
		System.out.println("------forward direction-------");
		dll.RemoveAtBeg();
		dll.printall();
		System.out.println("------Reverse direction-------");
		dll.printallrev();
		System.out.println("------forward direction-------");
		dll.RemoveAtEnd();
		dll.printall();
		System.out.println("------Reverse direction-------");
		dll.printallrev();
		
		
	}

}
