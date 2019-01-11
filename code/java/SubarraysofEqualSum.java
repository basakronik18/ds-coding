import java.util.Scanner;

/**
 * Created by ronik.basak on 04/08/16.
 */
public class SubarraysofEqualSum {
    public static void main(String[] args) {
        int i;
        System.out.println("Input Size:");
        Scanner scs = new Scanner(System.in);
        int size = Integer.parseInt(scs.next());
        System.out.println("Input Numbers:");
        int[] array = new int[size];
        for (i = 0; i <= size - 1; i++) {
            Scanner scn = new Scanner(System.in);
            array[i] = Integer.parseInt(scn.next());
        }
        findSubarraysofEqualSum(array, size);
        }


    public static void findSubarraysofEqualSum(int arr[], int n) {
        int i, sum_so_far = 0, total_sum = calcSum(arr);
        for (i = 0; i <= n - 1; i++) {
            if (2 * sum_so_far + arr[i] == total_sum) {
                System.out.println("The element needs to be removed is:" + arr[i]);
                printsubArray(arr, 0, i-1);
                System.out.println();
                printsubArray(arr, i + 1, n-1);
            } else
                sum_so_far = sum_so_far + arr[i];
        }


    }

    public static int calcSum(int a[]) {
        int i, sum = 0;
        int len = a.length;
        for (i = 0; i <= len - 1; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void printsubArray(int array[], int start, int end) {
        int j;
        for (j = start; j <= end; j++) {
            System.out.print(array[j]);
        }
    }

}
