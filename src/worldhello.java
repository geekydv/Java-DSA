import java.util.Scanner;

public class worldhello {

    public static void reverseWords(String s){
        String result = "";
        int i=0;
        int n=s.length();

        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i>=n){
                break;
            }
            int j=i+1;
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            String sub = s.substring(i,j);
            if(result.length()==0){
                result = sub;
            }
            else result = sub+" "+result;
            i=j+1;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        reverseWords(s);
    }
}
