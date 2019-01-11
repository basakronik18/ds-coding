

/**
 * Created by ronik.basak on 28/08/16.
 */
import java.util.HashMap;
import java.util.Map;

public class PrintItinerary {

    // This function populates 'result' for given input 'dataset'
    private static void printResult(Map<String,String> dataset){

        //To store reverse of the given map
        Map<String,String> reverseMap = new HashMap<String,String>();

        //To fill reversemap, iterate through the map
        for(Map.Entry<String,String> entry: dataset.entrySet()){
            reverseMap.put(entry.getValue(),entry.getKey());
        }

        //Find the starting point of the itinerary
        String start=null;
        for(Map.Entry<String,String> entry: dataset.entrySet()){
            if(!reverseMap.containsKey(entry.getKey())){
                start=entry.getKey();
                break;
            }
        }

        //If we can not find the starting point, something wrong with the input
        if(start==null){
            System.out.println("Invalid Input");
            return;
        }

        // Once we have starting point, we simple need to go next, next
        // of next using given hash map
        String to = dataset.get(start);
        while(to!=null){
            System.out.println(start+" -> "+to+" , ");
            start=to;
            to=dataset.get(to);
        }

    }

    //Driver Function
    public static void main(String[] args) {
        Map<String,String> dataset = new HashMap<String,String>();
        dataset.put("Chennai","Bangalore");
        dataset.put("Bombay","Delhi");
        dataset.put("Goa","Chennai");
        dataset.put("Delhi","Goa");

        printResult(dataset);
    }

}
