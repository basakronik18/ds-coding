

import java.math.BigInteger;

/**
 * Created by ronik.basak on 02/09/16.
 */
public class SumofInfiniteNumbers {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("9223372036854775808");
        BigInteger result = a.add(b);
        System.out.println("Result is = "+result);

        //integers.values().stream().mapToInt(i -> i.intValue()).sum();
        //integers.values().stream().mapToInt(Integer::intValue).sum();
    }

}
