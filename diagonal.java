import java.util.Scanner;
public class diagonal {
        public static void main(String[] args) {
        int i,j,n=3;
        int m=3,digonal=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix :");
        int[][] matrix = new int[m][n];
        for (i =0;i<m;i++){
            for (j =0;j<n;j++){
                matrix[i][j] = sc.nextInt();  
                
            if ((i + j) == (n - 1)) {
                    digonal += matrix[i][j]; 
        }
        System.out.println("The sum of diagoanl is :"+digonal);
    }
    
}
}
}

