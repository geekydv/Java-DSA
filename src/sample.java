import java.util.Scanner;

public class sample {

    static void printseclarge(int ar[],int size){
    int max1=0,max2=0;

    if(size<2){
        System.out.println("Array is small");
    }
    for(int i=0;i<size;i++){
        int temp=0;
        if(ar[i]>max1){
            temp = max1;
            max1=ar[i];

            max2=temp;
        }
        if(ar[i]<max1 && ar[i]> max2){
            max2=ar[i];
        }

    }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        printseclarge(ar,size);
    }
}
