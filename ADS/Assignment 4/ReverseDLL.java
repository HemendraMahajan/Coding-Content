public class ReverseDLL 
{
    Node head;
 
    static class Node 
	{
        int data;
        Node next;
        Node prev;
       

        Node(int data)
		{
        this.data = data;
        next = null;
        prev = null;
        }
    }
 
    public void insertData(int d) 
	{
        Node new_node = new Node(d);
        new_node.next = head;
        new_node.prev = null;
        if (head != null)
        head.prev = new_node;
        head = new_node;
    }
 
    public void reverseList() 
	{
        Node temp = null;
        Node current = head;
        while (current != null) 
		{
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null)
            head = temp.prev;
    }
 
    public void printData() 
	{
        Node temp = head;
        while (temp != null) 
		{
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
 
    public static void main(String args[])
	{
        ReverseDLL  list = new ReverseDLL();
         
		list.insertData(2);
        list.insertData(4);
        list.insertData(6);
        list.insertData(8);
        list.insertData(10);
        list.insertData(12);
 
        System.out.println("Original List:");
 
        list.printData();
        list.reverseList();
        System.out.println("\nReversed List:");
        list.printData();
    }
}
