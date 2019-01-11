

import java.util.Stack;

/**
 * Created by ronik.basak on 02/09/16.
 */
public class ReverseIndividualWordsofaSentence {
    public static void main(String[] args) {
        String input = new String();
        input = "This is a game";

        String words[] = input.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i];
            System.out.print(reverseWord(word));
            if(i!=words.length - 1)
                System.out.print(" ");
        }
        System.out.println("\n");
        for(int j=(words.length-1); j>=0; j--){
            String wordj = words[j];
            System.out.print(wordj);
            if(j!=0)
                System.out.print(" ");
        }
    }

    private static String reverseWord(String word) {
        Stack<Character> rev = new Stack<Character>();
        for(int ii=0; ii<word.length(); ii++ ){
            rev.push(word.charAt(ii));
        }
        String out = "";
        while(rev.size()!=0){
            out += rev.pop();
        }
        return out;
    }
}
