 
class Box{
         float height;
         float width;
         float breadth;

       Box(float h,float w,float b)
       {
            height = h;
            width = w;
            breadth = b; 
        }
     
        float getVolume()
       {  
        
        return height*width*breadth;
       }
       float getArea()
      {  
        return width*breadth;
     }
    public static void main(String agrs[])
       {
          Box B1 = new Box(10.0f,11.0f,12.0f);
          Box B2 = new Box(11.0f,12.0f,13.0f);
          System.out.println("Volume of box1 : "+B1.getVolume());
          System.out.println("Area of box1: "+B1.getArea());
           System.out.println("Volume of box2 : "+B2.getArea());
           System.out.println("Area of box2 : "+B2.getArea());
        }


}