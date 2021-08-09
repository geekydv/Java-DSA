import java.util.Scanner;

public class binarysearch {

    public static int binSearch(int[] ar, int target){
        int left=0;
        int right=ar.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(target<ar[middle]){
                right=middle-1;
            }
            else if(target>ar[middle]){
                left=middle+1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        System.out.println(binSearch(arr,target));
    }



}
