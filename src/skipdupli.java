import java.util.Scanner;

public class skipdupli {

    static int countDistinct(int arr[], int n)
    {
        int res = 1;

        // Pick all elements one by one
        for (int i = 1; i < n; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        System.out.println(countDistinct(ar,size));
    }

}
