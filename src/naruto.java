import java.util.Scanner;

public class naruto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String winner = "";
        char[] ch = str.toCharArray();
            for(int j=1;j<ch.length-1;j++){
                if(ch[0]==ch[j]){
                    System.out.println(winner="Naruto");
                }break;}


        int k=ch.length-1;
            if(winner.isEmpty()){
            if(k%2==1){
                winner="Sasuke";
                System.out.println(winner);
        }
            else{
                System.out.println(winner="Naruto");}
            }

        }


    }


