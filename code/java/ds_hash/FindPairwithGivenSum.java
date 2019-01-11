

/**
 * Created by ronik.basak on 27/08/16.
 */
public class FindPairwithGivenSum {
    private static int MAX=100000;
    public static void findPair(int arr[],int sum){
        int i;
        int size=arr.length;
        boolean binmap[] = new boolean[MAX];
        for(i=0;i<size;i++){
            int temp=sum-arr[i];
            if(temp>0 && binmap[temp]){
                System.out.println("The required pair is= "+arr[i]+" and "+temp);
            }
            binmap[arr[i]]=true;
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        findPair(A,n);
    }
}
