import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {

    public ArrayToString(String[] strAr) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] strAr = new String[size];
        for(int i=0;i<size;i++){
         strAr[i]=sc.nextLine();
            System.out.println(strAr[i]);
        }
        String str= String.join(" ",strAr);

        System.out.println(str);
    }
}
