/**
 * Created by ronik.basak on 25/08/16.
 */
public class LeadersinArray {

    public static void printLeaders(int arr[],int size){
        int i;
        int max_so_far = arr[size-1];
        System.out.print(max_so_far+" ");
        for(i=size-2;i>=0;i--){
            if (arr[i]>max_so_far){
                max_so_far=arr[i];
                System.out.print(max_so_far+ " ");
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
    }
}
