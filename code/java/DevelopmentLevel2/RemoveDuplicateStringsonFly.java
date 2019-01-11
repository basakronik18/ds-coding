import java.util.HashMap;
import java.util.Map;

/**
 * Created by ronik.basak on 31/08/16.
 */
public class RemoveDuplicateStringsonFly {

    public void removeDuplicate(String names[]){
        int len = names.length;
        Map<String,Boolean> strMap = new HashMap<String,Boolean>();
        for(int i=0;i<len;i++){
            if(!strMap.containsKey(names[i])){
                System.out.print(names[i]+" ");
            }
                strMap.put(names[i],true);
        }
    }

    public static void main(String[] args) {
        String[] list = new String[]{"Ted","John","Mark","Ted","David"};
        RemoveDuplicateStringsonFly rmv = new RemoveDuplicateStringsonFly();
        rmv.removeDuplicate(list);
    }
}
