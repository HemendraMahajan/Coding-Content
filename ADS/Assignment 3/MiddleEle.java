public class MiddleEle
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	
	public void display()
	{
		Node n = head;
		
		while(n != null)
		{
			System.out.print(n.data+" ");
			
			n = n.next;
		}
	}
	
	public void middleEle()
	{
		Node ptr1 = head;
		Node ptr2 = head;
		
		while(ptr2 != null && ptr2.next != null)
		{
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		System.out.println("Middle Element : "+ptr1.data);
	}
	
	public static void main(String[] args)
	{
		MiddleEle me = new MiddleEle();
		
		me.head = new Node(11);
		Node second = new Node(15);
		Node third = new Node(10);
		Node fourth = new Node(20);
		Node fifth = new Node (25);
		
		me.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		me.display();
		System.out.println();
		me.middleEle();
		
	}
}