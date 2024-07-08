
import java.util.Scanner;

public class AreaCircum 
{
    public static void main(String[] args) 
    {
        double area,circum,r;
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        r=sc.nextDouble();
        area= pi*r*r;
        circum= 2*pi*r;
        
        if (1<=r && r<=1000) 
        {    
            System.out.println("Area="+String.format("%.4f",area));
            System.out.println("Circumference="+String.format("%.4f",circum));
        }
        else
        {
            System.out.println(-1);
        }

    }
}
