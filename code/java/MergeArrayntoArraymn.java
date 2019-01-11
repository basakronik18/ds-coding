/**
 * Created by ronik.basak on 25/08/16.
 */
public class MergeArrayntoArraymn {

    public static void movetoEnd(int mPlusN[],int size){
        int i;
        int j = size-1;
        for(i=size-1;i>=0;i--){
            if(mPlusN[i]!=-1) {
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }

    public static void merge(int mPlusN[], int N[], int m, int n){
        int i=n;
        int j=0;
        int k=0; /*Index of output*/

        while(k<(m+n)){
            if((i<(m+n)&&mPlusN[i]<N[j])||(j==n)){
                mPlusN[k]=mPlusN[i];
                k++;
                i++;
            }
            else{
                mPlusN[k]=N[j];
                j++;
                k++;
            }
        }
    }

    public static void printArray(int arr[],int size){
        int i;
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String args[]){
        /* Initialize arrays */
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 25};
        int n = N.length;
        int m = mPlusN.length - n;

        /*Move the m elements at the end of mPlusN*/
        movetoEnd(mPlusN,m+n);

        /*Merge N[] into mPlusN[] */
        merge(mPlusN,N,m,n);

        /* Print the resultant mPlusN */
        printArray(mPlusN,m+n);
    }
}
