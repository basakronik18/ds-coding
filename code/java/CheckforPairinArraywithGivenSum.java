

/**
 * Created by ronik.basak on 24/08/16.
 */
public class CheckforPairinArraywithGivenSum {
    private static final int MAX = 100000;
    static void printPairs(int arr[], int sum){
        boolean[] binmap = new boolean[MAX];

        for(int i=0; i<arr.length; i++){
            int temp = sum - arr[i];

            if (temp > 0 && binmap[temp]){
                System.out.println("Pair with given sum " + sum + " is " + arr[i] + " and " + temp );
            }
            binmap[arr[i]]=true;
        }

    }

    public static void main(String args[]){
        int A[] = {1, 4, 45, 6, 10, 8};
        int s = 16;
        printPairs(A,s);
    }
}
