

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ronik.basak on 02/09/16.
 */
public class LongestSubstringwithNonRepeatingCharacter {


    public static void main(String[] args) {
        LongestSubstringwithNonRepeatingCharacter ls = new LongestSubstringwithNonRepeatingCharacter();
        String input = new String();
        input = "ABDEFGABEFZXCVNMGAHBDKSLCTA";
        String res =findLongest(input);
        System.out.print(" Longest Sub-String = " + res);
    }

    private static String findLongest(String input) {
        HashMap<Character,Boolean> binMap = new HashMap<Character, Boolean>();
        int i=0, count = 0;
        String sub = "";
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        while(i < input.length()){
            if(!binMap.containsKey(input.charAt(i))){
                //System.out.print(in[i]);
                sub += input.charAt(i);
                count++;
                binMap.put(input.charAt(i),true);
            }
            else{
                //System.out.println("Sub = "+sub);
                int prev_idx = i - count;
                map.put(sub,count);
                count=0;
                sub = "";
                binMap.clear();
                i = prev_idx;
            }
            i++;
        }
        map.put(sub,count);
        Map.Entry<String,Integer> maxValue = null;
        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println("Key = "+entry.getKey());
            System.out.println("Value = "+entry.getValue());
            if (maxValue == null || entry.getValue().compareTo(maxValue.getValue()) > 0){
                maxValue = entry;
        }
        }
        return maxValue.getKey();
    }
}
