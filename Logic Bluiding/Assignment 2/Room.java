class Room
{
    
    float height =10;
    float width =20;
    float breadth =30;
    float volume1;

    public static void main(String args[])
{

    Room r = new Room();

    float a= r.volume();
    System.out.println(a);
}
    
    float volume()
{
                volume1 = height*width*breadth;
                //System.out.println(volume1);
                return volume1;
}
}