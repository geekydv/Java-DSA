import java.util.Scanner;

public class min_max {
    static int getmin(int arr[],int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            res = Math.min(res,arr[i]);
        }
        return res;
    }
    static int getmax(int arr[],int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Min"+getmin(arr,size));
        System.out.println("Max"+getmax(arr,size));
    }
}
