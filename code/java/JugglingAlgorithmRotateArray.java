/**
 * Created by ronik.basak on 25/08/16.
 */
public class JugglingAlgorithmRotateArray {
    public static void leftRotate(int arr[],int d,int n){
        int i,temp;
        int j,k;
        for(i=0;i<gcd(d,n);i++){
            j=i;
            temp = arr[i];
            while(1!=0){
                k=j+d;
                if(k>=n){
                    k=k-n;
                }
                if(k==i) break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }


    public static int gcd(int a, int b){
        if(b==0) return a;
        else return (gcd(b,a%b));
    }

    public static void printArray(int arr[],int size){
        int i;
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,7};
        leftRotate(arr, 2, 7);
        printArray(arr, 7);
    }
}
