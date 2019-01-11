import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by ronik.basak on 04/08/16.
 */
public class JollyJumper {
    public static void main(String args[]) {
        int i, diff;
        boolean op;
        Scanner scs = new Scanner(System.in);
        int size = Integer.parseInt(scs.next());
        int[] numbers = new int[size];
        for (i = 0; i <= size - 1; i++) {
            Scanner scn = new Scanner(System.in);
            numbers[i] = Integer.parseInt(scn.next());
        }
        op = findJollyJumper(numbers, size);
        if (op == Boolean.TRUE){
            System.out.println("The series is a Jolly Jumper series");
        }
        else {
            System.out.println("The series is not a Jolly Jumper series");
        }
    }

    public static Boolean findJollyJumper(int a[], int n) {
        int size=n, diff,i;
        Boolean[] array = new Boolean[size];
        Arrays.fill(array, Boolean.FALSE);
        int[] numbers;
        numbers = a;
        for(i=0;i<size-1;i++){
            diff = abs(numbers[i+1] - numbers[i]);
            if (diff == 0 || diff > size-1 || array[diff] == Boolean.TRUE){
                return Boolean.FALSE;
            }
            else
                array[diff]= Boolean.valueOf("TRUE");
        }
        return Boolean.TRUE;
    }

}
