import java.util.Scanner;

class binarysearch1 {

    public static int binSearch(int[] ar, int tgt){
        int left=0;
        int right= ar.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(tgt<ar[mid]){
                right=mid-1;
            }
            else if(tgt>ar[mid]){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int tgt=sc.nextInt();
       int output= binSearch(arr,tgt);
        System.out.println(output);
    }
}
