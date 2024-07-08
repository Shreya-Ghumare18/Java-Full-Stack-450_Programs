
import java.util.Scanner;

public class Add2int {
    
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("first number:");
        a=sc.nextInt();

        System.out.print("Second number:");
        b=sc.nextInt();

        sum= a+b;
        if(sum<0) {
            System.out.println("-1");
           
        }
        else{
            System.out.println(sum);
        }



    }
}
