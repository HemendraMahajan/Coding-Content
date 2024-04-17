public class NthElement
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
	
	public int nElement(int pos)
	{
		if (head == null) 
		{
            return 0; 
        }
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
			if(count == pos)
				return temp.data;
			count++;
			temp = temp.next;
		}
		assert(false);
		return 0;
	}
	
	public static void main(String[] args)
	{
		NthElement el = new NthElement();
		
		el.head = new Node(10);
		Node second = new Node(15);
		Node third = new Node(20);
		Node fourth = new Node(25);
		
		el.head.next = second;
		second.next = third;
		third.next = fourth;
		
		el.display();
        System.out.println();
		int n = el.nElement(2); 
        if (n != 0) {
            System.out.println("The element at position 2 is: " + n);
        }
		
	}
}