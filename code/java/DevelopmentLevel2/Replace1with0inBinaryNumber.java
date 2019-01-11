

import java.util.Scanner;

/**
 * Created by ronik.basak on 07/09/16.
 */
public class Replace1with0inBinaryNumber {
    public static void main(String[] args) {
        int[] bin = new int[25];
        System.out.println("Enter the decimal Number:");
        Scanner sc = new Scanner(System.in);
        int dec = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the place of bit:");
        Scanner sc1 = new Scanner(System.in);
        int k = Integer.parseInt(sc1.nextLine());

        int i=0;
        while(dec>0){
            bin[i++] = dec%2;
            dec=dec/2;
        }


        if(bin[k-1]==1){
            bin[k-1] = 0;
        }

        int op = 0;
        int power = 0;
        for(int l=0;l<i;l++){
            double p = Math.pow(2,power);
            op = op + (int)(bin[l]*p);
            power++;
        }
        System.out.println("The output is = "+op);
    }
}
