public class TreeTraverse
{
	Node root;
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left = right= null;
		}
	}
	
	TreeTraverse(){
		root = null;
	}
	TreeTraverse(int d){
		root = new Node(d);
	}
	

    public void printInorder(Node n)
    {
	    if(n == null)
		return;
	
	    printInorder(n.left);
	    System.out.print(n.data + " ");
	    printInorder(n.right);
    }
 
    public void inorder()
    {
	    printInorder(root);
    }
 
 
    public void printPreorder(Node n)
    {
	    if(n == null)
		return;
	
	    System.out.print(n.data + " ");
	    printPreorder(n.left);
	    printPreorder(n.right);
    }
 
    public void preorder()
    {
	    printPreorder(root);
    }	
 
  
    public void printPostorder(Node n)
    {
	    if(n == null)
		return;
	
	
	    printPostorder(n.left);
	    printPostorder(n.right);
	    System.out.print(n.data + " ");
    }
 
    public void postorder()
    {
	    printPostorder(root);
    }	
 
		
	public static void main(String args[])
	{
		TreeTraverse t1 = new TreeTraverse();
		t1.root = new Node(20);
		t1.root.left = new Node(25);
		t1.root.right = new Node(56);
		t1.root.right.right = new Node(12);
		
		System.out.println("Inorder---->");
		t1.inorder();
		
		System.out.println();
		System.out.println("Preorder---->");
		t1.preorder();
		
		System.out.println();
		System.out.println("Postorder---->");
		t1.postorder();
		
	}
}