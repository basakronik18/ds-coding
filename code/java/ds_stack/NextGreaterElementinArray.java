package ds_stack;

import java.util.Stack;

/**
 * Created by ronik.basak on 10/11/16.
 */
public class NextGreaterElementinArray {

    public void nextGreater(int arr[],int size){
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[0]);
        for(int i=1;i<size;i++){
            while(!s.isEmpty() && s.peek()<arr[i]){
                int ele = s.pop();
                //if(arr[i] > ele)
                    System.out.println(ele + " -> " + arr[i]);
                //else {
                    //s.push(ele);
                //}
            }
            s.push(arr[i]);
        }
        while(!s.isEmpty()){
            int temp = s.pop();
            System.out.println(temp + " -> " + "-1");
        }
    }

    public static void main(String[] args) {
        NextGreaterElementinArray obj = new NextGreaterElementinArray();
        int array[] = {2,3,10,11,5,4};
        int s = array.length;
        obj.nextGreater(array,s);
    }

}
