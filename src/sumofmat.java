import java.util.Scanner;

public class sumofmat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int primaryDiagonal = 0,secondDiagonal=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    primaryDiagonal +=matrix[i][j];
                }
                if(i+j==n-1){
                    secondDiagonal +=matrix[i][j];
                }
            }
        }
        System.out.println(primaryDiagonal+" "+secondDiagonal);
    }
}
