import java.util.Scanner;

public class selectionsort {

    public static void selectionSort(int ar[],int size){
        for(int i=size-1;i>0;i--){
            int max_index=i;
            for(int j=0;j<i;j++){
                if(ar[j]>ar[max_index]){
                    max_index=j;
                }
            }
            if(max_index!=i) {
                int temp = ar[i];
                ar[i] = ar[max_index];
                ar[max_index] = temp;
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[] =new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        selectionSort(ar,size);
        for(int i=0;i<size;i++){
            System.out.println(ar[i]+" ");
        }
    }
}
