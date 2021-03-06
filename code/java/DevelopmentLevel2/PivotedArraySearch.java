package DevelopmentLevel2;

/**
 * Created by ronik.basak on 24/09/16.
 */
public class PivotedArraySearch {
    public static int search(int arr[], int l, int h, int key)
    {
        if (l > h) return -1;

        int mid = (l+h)/2;
        if (arr[mid] == key) return mid;

    /* If arr[l...mid] is sorted */
        if (arr[l] <= arr[mid])
        {
        /* As this subarray is sorted, we can quickly
           check if key lies in half or other half */
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid-1, key);

            return search(arr, mid+1, h, key);
        }

    /* If arr[l..mid] is not sorted, then arr[mid... r]
       must be sorted*/
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid+1, h, key);

        return search(arr, l, mid-1, key);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,5,6,7,8,1,2,3};
        PivotedArraySearch piv = new PivotedArraySearch();
        int n = arr.length;
        int data = 6;
        int pos = search(arr,0,n-1,data);
        if(pos == -1)
            System.out.println("Element is not present.");
        else
            System.out.println("Element is present at "+pos+" position.");
    }
}
