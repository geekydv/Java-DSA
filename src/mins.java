import java.util.Scanner;

public class mins {
    public static void main(String[] args) {
        int min=0;
        int j=0;
        String s="1d17h10m";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='d'){

                min = Integer.parseInt(s.substring(j,i));
                min=min*24*60;
                j=i+1;
            }
            if(s.charAt(i)=='h'){
                min=min+((Integer.parseInt(s.substring(j,i)))*60);
                j=i+1;
            }
            if(s.charAt(i)=='m'){
                min=min+(Integer.parseInt(s.substring(j,i)));
            }
        }
        System.out.println(min);
    }
}
