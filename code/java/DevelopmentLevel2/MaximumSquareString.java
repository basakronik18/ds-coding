package DevelopmentLevel2;

/**
 * Created by ronik.basak on 27/10/16.
 */
public class MaximumSquareString {

    public static int len_square(String str){
        int max_len = 1;
        for(int i=1 ; i<=(str.length()-1)/2; i++){
            String cmp1 = (str.substring(0,i) + str.substring(0,i));
            String cmp2 = str.substring(0,2*i);
            if(cmp1.compareTo(cmp2) == 0) {
                System.out.println("Match");
                max_len = (2 * i);
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        MaximumSquareString ms = new MaximumSquareString();
        int res = ms.len_square("abcd");
        System.out.println("Maximum length of square substring is = "+res);
    }
}
