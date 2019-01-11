package DevelopmentLevel2;

/**
 * Created by ronik.basak on 28/09/16.
 */
public class StringCompressionwithCount {
    public static void compressString(String str) {
        int i=0;
        char input[] = str.toCharArray();
        if (str == null)
            System.out.println("String is Empty.");
        if (str.length() < 2)
            System.out.println(str);
        else {
            while( i <= (str.length() - 2) ) {
                int char_count = 1;
                int j = i+1;
                while (j<input.length && (input[j] == input[i]))
                {
                    char_count++;
                    input[j] = ' ';
                    j++;
                }
                if(char_count != 1)
                    input[i+1] = Integer.toString(char_count).charAt(0);
                i=j;
            }
        }
        for (int k = 0; k < input.length;k++ )
            if(input[k] !=' ')
            System.out.print(input[k]);
    }


    public static void main(String[] args) {
        StringCompressionwithCount obj  = new StringCompressionwithCount();
        String str = new String("AAABBBCCDD");
        obj.compressString(str);
    }


}

