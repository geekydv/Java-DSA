import java.util.Scanner;
import java.util.Stack;

public class testrevstrstk {
    public static void revstring(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                st.push(s.charAt(i));
            }
            else{
                while(!st.empty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while(!st.empty()) {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        revstring(str);

    }
}
