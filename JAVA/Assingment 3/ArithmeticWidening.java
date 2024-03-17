package Test;

public class ArithmeticWidening {
       public static void main(String args[])
       {
    	   int num1 = 10;
    	   double num2 = 12.123d;
    	   float num3 = 10.00f;
    	   
    	   double Result = num1+num2+num3;
    	   double Result1 = num1*num2*num3;
    	   double Result2 = num1/num2/num3;
    	   
    	   System.out.println("Result : " +Result);
    	   System.out.println("Result1 : " +Result1);
    	   System.out.println("Result2 : " +Result2);
       }
}
