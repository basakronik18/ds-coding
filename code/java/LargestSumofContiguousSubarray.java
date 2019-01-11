

/**
 * Created by ronik.basak on 24/08/16.
 */
public class LargestSumofContiguousSubarray {

    public static int maxSubArraySum(int arr[],int size){
        int max_so_far = arr[0];
        int curr_max = arr[0];
        int i;
        for(i=1;i<size;i++){
            curr_max = Math.max(arr[i],curr_max+arr[i]);
            max_so_far = Math.max(max_so_far,curr_max);
        }
        return max_so_far;
    }

    public static int maxsumNonContiguous(int[] array){
     /* Empty array */
        if(array == null)
            return 0;
        int arrayLength = array.length;
     /* Current maximum sum including the current value */
        int sum1 = array[0];
     /* Current maximum sum excluding the current value */
        int sum2 = 0, sum3 = 0;
     /* Iterate through the array from second element to the end */
        for(int i = 1; i  <  arrayLength; i++){
         /* Current maximum sum excluding the current index value */
            sum3 = Math.max(sum1,sum2);
         /* Move the value of sum3 into sum2 */
            sum2 = sum3;
         /* Current maximum sum including the current index value */
            sum1 = sum2 + array[i];
        }
     /* Return the maximum of sum1 and sum2 */
        return Math.max(sum1, sum2);
    }


    public static void main(String[] args) {
        int A[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int size = A.length;
        int max_sum = maxSubArraySum(A,size);
        System.out.println("Largest sum of contiguous sub array is = "+max_sum);
        int max_nonc_sum = maxsumNonContiguous(A);
        System.out.println("Largest sum of non-contiguous sub array is = "+max_nonc_sum);
    }

}
