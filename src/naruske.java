import java.util.Scanner;

public class naruske {
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static int Win(String str, int i){

        for(i=0;i<str.length()-1;i++){

            charRemoveAt(str,i);
            if(str.charAt(i+1)=='\0'){
                if(i/2==0){
                    return 0;
                }
                else{
                    return 1;
                }

        }
    }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int j=0,k=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(0)){
                k++;
            }
            else{
                 j=Win(str,0);}
            }
        if(k!=0){
            System.out.println("Naruto");
        }
        else{

        }


    }
}
