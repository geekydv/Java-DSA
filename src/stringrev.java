import java.util.Scanner;

public class stringrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i =s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            System.out.print(ch);
        }
    }


}
