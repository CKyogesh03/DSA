package recursion.basic_programs;

import java.util.Arrays;

public class ReverseArray {
    static int[] reverseUsingRecursion2Pointer(int[] arr){
        return arr;
    }

    static void reverse1Pointer(){

    }
    //pending
    static void reverse2Pointer(int[] arr){
        int start=0,end=arr.length-1;
        while (start<end){
            if (start==end){
                break;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1={5,4,3,2,1}; // 5 numbers // odd
        int[] arr2={40,30,20,10}; //4 numbers //even
//        reverse(arr1);
//        reverse(arr2);
    }
}
