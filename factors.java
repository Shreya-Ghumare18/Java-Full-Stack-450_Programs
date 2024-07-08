import java.util.Scanner;

class factors
{
    public static void main(String args[])
    {
        int num, result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        System.out.println("The factors of a number are:");
        for (int i = 1; i <=num; ++i) {
            if ( num % i ==0) {
                System.out.print(i+" ");
               
                result+=i;
                
            }
           
        }
        System.err.println("  ");
        System.out.println("Sum of factors:");
        System.out.println(result);

    }
}