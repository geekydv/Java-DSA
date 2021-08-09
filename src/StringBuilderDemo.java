import java.util.Scanner;

public class StringBuilderDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String s="HELOO HOW ARE YOU";

        StringBuilder sb1=sb.append("Hello");
        if(sb1==sb){
            System.out.println("true");
        }
        if(sb1.equals(sb)){
            System.out.println("true");
        }
        StringBuilder j=sb1.reverse();
        System.out.println(j);

        System.out.println(s.trim());


    }

}
