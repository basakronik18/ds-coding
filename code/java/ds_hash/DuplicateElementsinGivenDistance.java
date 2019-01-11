
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ronik.basak on 27/08/16.
 */
public class DuplicateElementsinGivenDistance {
    private static int MAX=100000;
    public static boolean findDuplicate(int arr[],int distance){

        int i;
        /*create an empty hashset*/

        HashSet<Integer> set = new HashSet<Integer>();

        for(i=0;i<arr.length;i++){
            // If already present n hash, then we found
            // a duplicate within k distance
            if (set.contains(arr[i]))
                return true;

            // Add this item to hashset
            set.add(arr[i]);

            // Remove the k+1 distant item
            if (i >= distance)
                set.remove(arr[i-distance]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (findDuplicate(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
