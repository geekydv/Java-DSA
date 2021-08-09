import java.util.Scanner;

public class insertionsort {
     static void Sort(int a[],int n){
        for(int i=1;i<n;i++){
            int key=a[i];
            int j =i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;

        }

    }

    static void printArray(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
        }
        Sort(a,n);
        printArray(a);
    }



}
