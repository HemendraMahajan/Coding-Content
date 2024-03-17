 
class Student
   {
         float age ;            // (Instance variable or Gobal Variable)
         float height;
         float weight;
    
Student(float a,float h,float w)  // Constructor
     { 
       age = a;
       height = h;
       weight = w;
      }
 void  display()                 //  Method
{
          System.out.println("Student age : " +age);
          System.out.println("Student height : " +height);
          System.out.println("Student weight : " +weight);
          
}
    public static void main(String args[])
{
                Student s1 = new Student(23,170,60);  // Object Creation 
		

		System.out.println(" Student1 :");
		s1.display();
	
}
}