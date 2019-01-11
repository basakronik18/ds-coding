

/**
 * Created by ronik.basak on 24/08/16.
 */
public class SearchElementinSortedRotatedArray {
    public static int searchElement(int arr[], int l, int h, int key){
        int mid;
        if(l>h) return -1;

        mid = (l+h)/2;
        if(arr[mid] == key) return mid;

        /*if the array arr[l....mid] is sorted*/
        if(arr[l]<=arr[mid]){

            /*if the subarray be sorted*/
            if(key>=arr[l] && key<=arr[mid]){
                return searchElement(arr,l,mid-1,key);
            }
                return searchElement(arr,mid+1,h,key);

        }

        /*if the array arr[l....mid] is not sorted, then arr[mid....h] must be sorted*/
        if(key>=arr[mid] && key<=arr[h]){
            return searchElement(arr,mid+1,h,key);
        }

            return searchElement(arr,l,mid-1,key);

    }

    public static void main(String args[]){
        int[] A = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        int size = A.length;
        int key = 1;
        System.out.println("size = "+ (size-1));
        int index = searchElement(A,0,(size-1),key);
        System.out.println("The index of the element is = " + index);
    }
}
