import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ronik.basak on 05/08/16.
 */
public class AddElementswithConstraints {
    public static void main(String[] args) {
        int i;
        int[] array1, array2;
        array1 = takearrayInput();
        array2 = takearrayInput();
        addElementswithConstraints(array1, array2);
    }

    private static int[] takearrayInput() {
        int i;
        System.out.println("Input Size:");
        Scanner scs = new Scanner(System.in);
        int size = Integer.parseInt(scs.next());
        System.out.println("Input Numbers:");
        int[] array = new int[size];
        for (i = 0; i <= size - 1; i++) {
            Scanner scn = new Scanner(System.in);
            array[i] = Integer.parseInt(scn.next());
        }
        return array;
    }

    private static void addElementswithConstraints(int[] array1, int[] array2) {
        int len1,len2,i,j,k,sum;
        List<Integer> list = new ArrayList<Integer>();
        len1 = array1.length;
        len2 = array2.length;
        for(i=0;i<=len1-1 && i<=len2-1;i++){
            sum = array1[i] + array2[i];
            if (sum > 10){
                splitInsert(sum, list);
            }
            else{
                list.add(sum);
            }
        }
        if (len1 > i){
            for(j=i;j<len1;j++){
                list.add(array1[j]);
            }
        }
        if (len2 > i){
            for(k=i;k<len2;k++){
                list.add(array2[k]);
            }
        }
        printList(list);

    }

    private static void printList(List<Integer> list) {
        int c;
        for(c=0;c<=list.size()-1;c++){
            System.out.print(list.get(c));
            }
        }

    private static void splitInsert(int sum, List<Integer> list) {
        int rem,l;
        List<Integer> in_list = new ArrayList<Integer>();
        while (sum > 0){
            rem = sum % 10;
            sum = sum / 10;
            in_list.add(rem);
        }
        for(l=in_list.size()-1; l>=0; l--){
            list.add(in_list.get(l));
        }
        in_list.clear();
    }
}




