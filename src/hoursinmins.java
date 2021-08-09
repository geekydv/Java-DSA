import java.util.Scanner;

public class hoursinmins {
    public static void main(String[] args) {
        String str[] = {"1d", "24h", "12m"};
        int value;
        int mins = 0;
        for (int i = 0; i < str.length; i++) {
            value = 0;
            if (str[i].contains("d")==true) {
                value = Integer.valueOf(str[i]);
                mins = value * 24 * 60;

            }
            if (str[i].contains("h")==true) {
                value = Integer.parseInt(str[i]);
                mins = mins + (value * 60);

                if (str[i].contains("m")==true) {
                    value = Integer.parseInt(str[i]);
                    mins = mins + (value);
                }


            }

        }
        System.out.println(mins);
    }
}