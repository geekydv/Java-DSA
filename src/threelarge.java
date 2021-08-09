import java.util.Scanner;

public class threelarge {

    static void printthreel(int[] arr,int size){
        int i,first,second,third;
        third = first =second = Integer.MIN_VALUE;
        for(i =0;i<size;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println("Three largest:"+first+" "+second+" "+third);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        printthreel(arr,size);

    }

}
