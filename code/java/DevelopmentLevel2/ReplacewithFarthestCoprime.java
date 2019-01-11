

/**
 * Created by ronik.basak on 07/09/16.
 */
public class ReplacewithFarthestCoprime {

    public int gcd(int a, int b){
        if(a==b)
            return a;
        else if(a > b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);
    }

    public int largest_coprime(int n, int range){
        int j;
        for(j=range; j>=(range/n); j--){
            if(gcd(n,j) == 1)
               break;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{249,248,250,247,12};
        int range = 250;
        ReplacewithFarthestCoprime pr = new ReplacewithFarthestCoprime();
        for(int i=0; i<arr.length;i++ ){
            arr[i] = pr.largest_coprime(arr[i],range);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
