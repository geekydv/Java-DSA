import java.util.Scanner;

public class movezeros {

    static void pushZerosToEnd(int ar[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                ar[count++]=ar[i];
            }
        }

        while(count<n){
        ar[count++]=0;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        pushZerosToEnd(ar,size);
        for(int i=0;i<size;i++){
            System.out.print(ar[i]+" ");
        }
    }





}
