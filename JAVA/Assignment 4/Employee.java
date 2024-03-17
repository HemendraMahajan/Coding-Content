public class Employee {
            
	          String name;
	          int empid;
	          double salary;
	          
	         void  company (String name, int empid)
	          {
	        	  System.out.println("Employee Name : "+name);
	        	  System.out.println("Employee empid : "+empid);
	        	
	          }
	         void  company (int empid, String name, double salary){
	          
	        	  System.out.println("Employee empid : "+empid);
	        	  System.out.println("Employee Name : "+name);
	        	  System.out.println("Employee salary : "+salary);
	          }
	         void  company (String name)
	          {
	        	  System.out.println("Employee Name : "+name);
	          }
	          
	          
	          public static void main(String[] args)
	          {
	        	  Employee emp =  new Employee();
	        	  
	        	  emp.company("abc" , 1234);
	        	  emp.company(9874 , "xyz" , 50000);
	        	  emp.company("pqr");
	        	  
	          }
	           
}
