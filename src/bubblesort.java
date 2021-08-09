import java.util.*;

class Main {
    public  static void bubblesort(int[] arr,int n)
    {
        boolean bool=false;
        for (int i = 0; i < n; i++) {
            bool=false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    bool=true;
                }
            }
            if(bool==false)
            {
                break;
            }

        }
    }
    public  static  void printAfterSort(int[] arr)
    {
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        // Your code here
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int k=0;k<n;k++)
            {
                arr[k]=sc.nextInt();

            }
            bubblesort(arr,n);
            printAfterSort(arr);
            System.out.println();
        }
    }
}