import java.util.Scanner;

public class DeleteDLL
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void insertData(int d)
	{
		Node newNode = new Node(d);
		
		if(head == null)
		{
			newNode.prev = null;
			newNode.next = null;
			head = newNode;
			return;
		}
		newNode.prev = null;
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	
	public void deleteNode(Node n)
	{
		//base condition
		if(head == null || n == null)
		{
			return;
		}
		//deletion at the begining
		if(head == n)
			head=n.next;
			//head.prev=null;
		// deletion in between two elements
		if(n.next != null)
			n.next.prev = n.prev;
		if(n.prev != null)
			n.prev.next=n.next;
		
		return;
		
		
	}
	
	
	public void display()
	{
		Node p=null;
		System.out.println("Forward Printing");
		while(head != null)
		{
			System.out.print(head.data+" ");
			p=head;
			head=head.next;
		}
		System.out.println("\n-----------");
		System.out.println("Backward Printing");
		while(p != null)
		{
			System.out.print(p.data+" ");
			p=p.prev;
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DeleteDLL dl = new DeleteDLL();
		
		for(int i=0; i<5;i++)
		{
			dl.insertData(sc.nextInt());
		}
		/*dl.insertData(10);
		dl.insertData(11);
		dl.insertData(12);
		dl.insertData(13);
		dl.insertData(14);
		dl.insertData(15);
		dl.insertData(16);
		dl.insertData(17);
		dl.insertData(18);*/
		
		dl.display();
		
       // dl.display(dl.head);
		dl.deleteNode(dl.head.next);
		dl.display();
	}
}