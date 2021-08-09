import java.util.Scanner;
import java.util.Stack;

public class revstr {
    static void reverseWords(String str){
        Stack<Character> st=new Stack<Character>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                st.push(str.charAt(i));
            else{
                while(!st.empty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while(!st.empty()){
            System.out.print(st.pop());
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverseWords(str);
    }



}
