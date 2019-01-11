package DevelopmentLevel2;

/**
 * Created by ronik.basak on 25/09/16.
 */
public class MaximumOccuringCharacterinString {

    public static char getMaxChar(String str) {
        int ASCII_SIZE = 256;
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';


        // Traversing through the string and maintaining
        // the count of each character
        for(int i=0;i<len;i++){
            if(max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MaximumOccuringCharacterinString maxchar = new MaximumOccuringCharacterinString();
        String str = new String("geeksforgeeks");
        char res = maxchar.getMaxChar(str);
        System.out.println("The maximum occuring character is "+res);
    }
}
