/**
 * Created by ronik.basak on 25/08/16.
 */
public class MaximumSumwithoutAdjacent {

    public static int FindMaxSum(int arr[],int n){
        int excl=0,i;
        int incl=arr[0];
        int excl_new;
        for(i=1;i<=n;i++){
            /*current max excluding i*/
            excl_new=(incl>excl)?incl:excl;

            /*current max including i*/
            incl=excl+arr[i];
            excl=excl_new;
        }
        return((incl>excl)?incl:excl);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        System.out.println(FindMaxSum(arr, arr.length-1));
    }
}
