import java.util.Scanner;
class Student {

       String  name ;
       int  rollNo ;
       float  marks;

        void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Name: ");
		this.name=sc.nextLine();
		System.out.print("Rollno: ");
		this.rollNo=sc.nextInt();
		System.out.print("Marks: ");
		this.marks=sc.nextInt();
		}
		void printRecord() {
			System.out .println(this.name+"  "+this.rollNo+ " "+this.marks);
		}
		public static void main(String[] args)
		{
			Student ac = new Student();
			ac.acceptRecord();
			ac.printRecord();
              
		}
}


	
	

    

