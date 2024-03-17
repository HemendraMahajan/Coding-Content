class Person
{
        int age;
        float height;
        float weight;
        
      Person(int a,float h,float w)
      {
        age = a;
        height = h;
        weight = w;
       }
      int display()
       {
          System.out.println("Person age : " +age);
          System.out.println("Person height : " +height);
          System.out.println("Person weight : " +weight);
          return 0;
       }
       public static void main(String args[])
    {
          Person P1 = new Person(20,5.8f,58.5f);
          Person P2 = new Person (24,6.0f,65.33f);
        System.out.println("Person1");
        System.out.println(P1.display());
        System.out.println("Person2");
        System.out.println(P2.display());
     }
}
