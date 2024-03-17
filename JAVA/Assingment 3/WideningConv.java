package Test;

public class WideningConv 
{
     public static void main(String args[])
     {
    	  int num = 10;
    	  
    	  double doublenum = num;
    	  float floatnum = num;
    	  String Stringnum = Integer.toString(num);
    	  
    	  System.out.println("Result : " + doublenum);
    	  System.out.println("Result : " + floatnum);
    	  System.out.println("Result : " + Stringnum);
     }
     

}
