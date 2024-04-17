public class SLL
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
			System.out.print(n.data+" --");
			
			n = n.next;
		}
	}
	
	public int insertBeg(int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		head = new_node;
		
		return head.data;
	}
	
	public int insertInBet(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = prev_node.next;
		
		prev_node.next = new_node;
		
		return head.data;
		
	}
	
	public void append(int new_data)
	{
		
		Node new_node = new Node(new_data);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.next = null;
		
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new_node;
		return;	
	}
	
	public void deleteBeg(int key) // key is variable which contains value of node which we have to perform delete operation on it
	{
		Node temp = head;
		//Node prev = null;
		
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		}
	}
	
	public void deleteInBet(int key)
	{
		Node temp =head;
		Node prevnode = null;
		
		while(temp != null && temp.data != key)          // using this we can delete intermediate or end node also
		{
			prevnode = temp;
			temp = temp.next;
		}
		if(temp.data == key) // 
		{
			prevnode.next = temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		SLL sl = new SLL();
		
		sl.head = new Node(2);
		Node second = new Node(3);
		Node third = new Node(5);
		Node fourth = new Node(6);
		
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sl.insertBeg(1);
		sl.insertInBet(sl.head.next.next,4);
		sl.append(7);
		sl.display();
		
		System.out.println();
		sl.deleteBeg(1);
		sl.deleteInBet(5);
		sl.display();
		
	}
}
	