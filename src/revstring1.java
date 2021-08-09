import java.util.Scanner;

public class revstring1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String revdstr="";
        for(int i=s.length()-1;i>=0;i--){
            revdstr=revdstr+s.charAt(i);
        }
        System.out.println(revdstr);
    }
}
