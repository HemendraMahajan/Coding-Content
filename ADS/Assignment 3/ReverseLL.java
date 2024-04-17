public class ReverseLL
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
	
	void display()
	{
		Node n = head;
		
		while(n != null)
		{
			System.out.print(n.data+" --");
			
			n = n.next;
		}
	}
	
	void reverse(Node node)
    {
	    node = head;
	    Node prev = null;
	    Node curr = node;
	    Node next = null;
	   
	   while(curr != null)
	   {
		  next = curr.next;
		  curr.next = prev;
          prev = curr;
		  curr = next;
	   }
	   head = prev;
	}
	
	public static void main(String[] args)
	{
		ReverseLL  RL = new ReverseLL();
		
		RL.head = new Node(10);
		Node second = new Node(11);
		Node third = new Node(12);
		Node fourth = new Node(13);
		
		RL.head.next = second;
		second.next = third;
		third.next = fourth;
		
		RL.display();
		System.out.println();
		RL.reverse(RL.head);
		RL.display();
	}
}