import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class jump {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int array_size=sc.nextInt();
        long jumps=sc.nextLong();
        int arr[]=new int[array_size];
        for(int i=0;i<array_size;i++){
            arr[i]=sc.nextInt();
        }
        int position=1;
        for(long j=0;j<jumps;j++){

            for(int i=1;i<=array_size;i++){
                if(arr[i]%2==1){
                    position=position-1;
                    arr[i]=arr[i-1];
                }
                else{
                    position=position+2;
                arr[i]=arr[i+2];
                }
            }
        }
        System.out.println(position);
    }
}
