import java.util.Scanner;
public class WeekDay{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        String weekdayname = " ";
        switch (day)
        {
            case 1:
                weekdayname = "Sunday";
                break;
            case 2:
                weekdayname = "Monday";
                break;
            case 3:
                weekdayname = "Tuesday";
                break;
            case 4:
                weekdayname = "Wednesday";
                break;
            case 5:
                weekdayname = "Thursday";
                break;
            case 6:
                weekdayname = "Firday";
                break;
            case 7:
                weekdayname = "Saturday";
                break;
        }
        System.out.println(" Weekday name is " +weekdayname);
        
    }
}