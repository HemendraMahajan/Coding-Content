public class DoublyLL
{
	Node head;
	 
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			this.data = d;
			prev = null;
			next = null;
		}
	}
	
	public void insertBeg(int newdata)
	{
		Node newnode = new Node(newdata);
		newnode.next = head;
		newnode.prev = null;
		
		if(head != null)
		{
			head.prev = newnode;
		}
			head = newnode;
	}
	
	public void insertAfter(Node prevNode, int newdata) //for insert in between
	{
		if(prevNode == null)
		   return;
	    Node newNode = new Node(newdata);
		newNode.next = prevNode.next;
	    prevNode.next = newNode;
	    newNode.prev = prevNode;
				  
	    if(newNode.next != null)
		{
		  newNode.next.prev = newNode;
		  return;
		}
	}
	

	public void append(int newdata) // insertion at end
	{
		Node newNode = new Node(newdata);
		Node n = head;
		newNode.next = null;// 
		
		if(head == null) // Linked list empty tha
		{
			newNode.prev = null;
			head = newNode;
			return;
		}
		while(n.next != null) // Linked list exist kar raha hai  
		{
			n = n.next;
		}
		n.next = newNode;
		newNode.prev = n;
	}
	
	
	
	
	public void display(Node n)
	{
		Node p=null;
		System.out.println("Forward Printing");
		while(n != null)
		{
			System.out.print(n.data+" ");
			p=n;
			n=n.next;
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
		DoublyLL dl = new DoublyLL();
		
		//dl.head = new Node(1);
		//dl.second = new Node(2);
		//dl.third = new Node(3);
		
		dl.insertBeg(1);
		dl.insertBeg(2);
		dl.insertBeg(3);
		dl.insertBeg(4);
		//dl.display(dl.head);
		
		dl.insertAfter(dl.head.next,6);
		//dl.display(dl.head);
		
		dl.append(5);
		dl.display(dl.head);
		
		
	}
}