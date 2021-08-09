import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class beautystr {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        long ans = -1;

        for(int digit = 1; digit*2 <= length; digit++){
            long x = 0;

            for(int i = 0; i < digit; i++){
                x = (10 * x) + (str.charAt(i) - '0');
            }
            String consecutiveSequnce = "";
            long y = x;
            while(consecutiveSequnce.length() < str.length()){
                consecutiveSequnce += String.valueOf(x);
                x++;
            }
            if(consecutiveSequnce.equals(str)){
                ans = y;
                break;
            }
        }
        if(ans == -1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES "+ans);
        }

    }
}