

/**
 * Created by ronik.basak on 05/10/16.
 */
public class FirstNonZeroNumberoftheFactorial {
    public static int firstNonZero(int n){
        long fact = 1L;
        for(int i=1;i<=n;i++)
            fact*=i;
        while(fact>0){
            int dig=(int) fact%10;
            if(dig!=0)
                return dig;
            else
                fact/=10;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNonZeroNumberoftheFactorial obj = new FirstNonZeroNumberoftheFactorial();
        int res = obj.firstNonZero(8);
        if(res!=-1)
            System.out.println("First non-zero digit is:" + res);
        else
            System.out.println("All digits are 0");
    }
}
