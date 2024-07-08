import java.util.*;

public class AdditionNum {
    public static void main(String args[])
    {
        int n,result=0,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        while(result<=100) { 
            n=sc.nextInt();
            result+=n;  
            
            if (result==100) {
                System.out.println("Done");
                break;
            }
            
        }
        
        //System.out.println(result);
        
    }
    
}
