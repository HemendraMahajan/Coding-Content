class Vehicle
{
String price;     
String color;
String model;

Vehicle(String p,String c,String m)
{
 this.price = p;
 this.color = c;
 this.model = m;
}
 String display(){
System.out.println("Vehicle price:" +price);
System.out.println("Vehicle color:" +color);
System.out.println("Vehicle modle:" +model);
return null;
}    
 public static void main(String args[]){
 Vehicle v = new Vehicle("Ten Lakh", "Black", "MG Gloster");
 `
 System.out.println("Vehicle:");
 v.display();
}
       }