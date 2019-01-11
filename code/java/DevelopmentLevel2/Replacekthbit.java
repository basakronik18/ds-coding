package DevelopmentLevel2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronik.basak on 28/10/16.
 */
public class Replacekthbit {
    public int turn_off(int n, int k){
        //k must be greater than 0
        if(k<=0)
            return n;
        System.out.println((1 << (k-1)));
        System.out.println(~(1 << (k-1)));
        return (n & ~ (1 << (k-1)));
    }

    public static void main(String[] args) {
        int num;
        Replacekthbit rep = new Replacekthbit();
        num = rep.turn_off(13,3);
        System.out.println(num);
    }
}
