import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        boolean flag=false;

        if(n<=3) System.out.println(n+" is a prime number");
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }else flag=true;
            }

            if(flag) System.out.println(n+" is a prime number");
            else  System.out.println(n+" is not a prime number");
        }

        sc.close();
    }
}
