

/**
 * Created by ronik.basak on 06/09/16.
 */
public class SwapwithoutThirdVariable {
    public static void main(String[] args) {
        int a=4, b=5;
        a=(a+b)-(b=a);
        System.out.println("Swapped a = "+a);
        System.out.println("Swapped b = "+b);
    }
}
