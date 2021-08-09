import java.util.Scanner;

public class sumofcol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int max_col = Integer.MIN_VALUE;
        for(int j=0;j<n;j++){

            int sum_col=0;
            for(int i=0;i<m;i++){
                sum_col +=matrix[i][j];
            }

            max_col=Math.max(max_col,sum_col);
        }
        System.out.println(max_col);
    }


}
