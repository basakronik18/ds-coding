

/**
 * Created by ronik.basak on 24/08/16.
 */
public class FindMajorityElementinArray {

    /* Method to print majority element */
    void printMajorityElement(int arr[], int size){

        /* Find candidate for majority */
        int cand  = findCandidate(arr,size);

        /* Print the candidate if it is majority */
        if (isMajority(arr,size,cand)){
            System.out.println("The majority Element is = " + cand + " ");
        }
        else {
            System.out.println("No Majority Element");
        }


    }

    private boolean isMajority(int[] arr, int size, int cand) {
        int i,cnt = 0;
        for(i=0; i<size; i++){
            if(arr[i] == cand){
                cnt++;
            }
        }
        if(cnt >= (size/2)){
            return true;
        }
        else{
            return false;
        }
    }

    private int findCandidate(int[] arr, int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i=0;i<size;i++){
            if(arr[i] == arr[maj_index]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                maj_index = i;
                count = 1;
            }
        }
        return arr[maj_index];
    }

    public static  void main(String args[]){
        FindMajorityElementinArray me = new FindMajorityElementinArray();
        int[] A = new int[]{1,3,3,3,3,1,2};
        int size = A.length;
        me.printMajorityElement(A,size);
    }
}
