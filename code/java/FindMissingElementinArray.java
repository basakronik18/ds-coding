

/**
 * Created by ronik.basak on 24/08/16.
 */
public class FindMissingElementinArray {
    public static int findmissingNumber(int arr[], int n){
        int total = (n+1)*(n+2)/2;
        int i,sum=0,term;
        for(i=0;i<n;i++){
            sum = sum + arr[i];
        }
        term = total - sum;
        return term;
    }

    public static void main(String[] args) {
        int A[] = new int[]{1, 2, 4, 5, 6};
        int size = A.length;
        int missingterm = findmissingNumber(A,size);
        System.out.println("The missing term is = "+missingterm);
    }
}
