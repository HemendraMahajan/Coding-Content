public class DLL1{
	
	Node head;

	static class Node{
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
	
	public void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;
		
	}
	
	public void display(Node n)
	{
		Node p = null;
	
		while(n != null)
		{
			System.out.print(n.data+"---> ");
			p=n;
			n=n.next;
		}
		System.out.println();
		
	
		while(p != null)
		{
			System.out.print(p.data+"---> ");
			p=p.prev;
		}
		
		
	}
	
	public static void main(String args[])
	{
		
		DLL1 d1 = new DLL1();
		d1.display(d1.head);
		
		d1.insert(20);
		d1.insert(15);
		d1.insert(10);
		d1.insert(5);
		d1.display(d1.head);
		
		
	}
	
}