import java.util.Scanner;
class Vehicle{

      String Name;
      String Color;
      int Price;
      String Tyre;

       int Car(String Name, String Color, int Price, String Tyre)
       {
          System.out.println("Car Name  :    "+Name);
          System.out.println("Car Color  :    "+Color);
          System.out.println("Car Price  :    "+Price);
          System.out.println("Car Tyre  :    "+Tyre);
         return 0;
        }

        int Car(String Name, String Color, int Price)
         {
           System.out.println("Car Name  :    "+Name);
           System.out.println("Car Color  :    "+Color);
           System.out.println("Car Price  :    "+Price);
           
         return 0;
         }

     public static void main(String[] args)
      {

          // Scanner sc = new Scanner(System.in);
             
           
          Vehicle VC = new Vehicle();

         VC.Car("MG Hector" , "Black" , 100000, "CEAT");
 
         VC.Car("Tata Nexon" , "White" , 115000);

       }
}