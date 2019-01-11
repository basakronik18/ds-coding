package DevelopmentLevel2;



/**
 * Created by ronik.basak on 24/09/16.
 */
public class AnagramsofaGivenString {

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    /* Function to print permutations of string
   This function takes three parameters:
   1. String
   2. Starting index of the string
   3. Ending index of the string. */
    /*void permute(char *a, int l, int r)
    {
        int i;
        if (l == r)
            printf("%s\n", a);
        else
        {
            for (i = l; i <= r; i++)
            {
                swap((a+l), (a+i));
                permute(a, l+1, r);
                swap((a+l), (a+i)); //backtrack
            }
        }
    }*/

    public static void main(String[] args) {
        AnagramsofaGivenString obj = new AnagramsofaGivenString();
        String str = new String("AA");
        permutation(str);
    }
}
