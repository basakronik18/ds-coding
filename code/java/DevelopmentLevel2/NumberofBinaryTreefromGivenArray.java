
/**
 * Created by ronik.basak on 31/08/16.
 */
public class NumberofBinaryTreefromGivenArray {

    // A Binomial coefficient based function to find nth catalan
    // number in O(n) time
    public long calc_Catalan(int arr[]){
        int n = arr.length;

        // Calculate value of 2nCn
        long c = binomialCoeff(2*n,n);

        return(c/(n+1));
    }

    private long binomialCoeff(int n, int k) {
       long res = 1;

        // Since C(n, k) = C(n, n-k)
        if(k > n-k){
            k = n - k;
        }

        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
        for(int i=0; i<k; i++){
            res *= (n-i);
            res /= (i+1);
        }

        return res;
    }

    /*Driver Function*/
    public static void main(String[] args) {
        NumberofBinaryTreefromGivenArray n = new NumberofBinaryTreefromGivenArray();
        int[] A = {1,2,3,4};
        long c = n.calc_Catalan(A);
        System.out.println("Number of BST possible = "+c);
    }
}
