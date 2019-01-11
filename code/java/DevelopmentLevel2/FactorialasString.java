package DevelopmentLevel2;

/**
 * Created by ronik.basak on 07/09/16.
 */
public class FactorialasString {
    public String calcFactorial(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res *= i;
        }
        String result = Integer.toString(res);
        return result;
    }

    public static void main(String[] args) {
        int input =5;
        FactorialasString fs = new FactorialasString();
        String s = fs.calcFactorial(input);
        System.out.println("The factorial is = "+s);
    }
}
