package array;
/*
->drawback of normal variables - stores specific typed single data. more variable needed to store more data
->advantage of array variables - stores specific/similar typed multiple data. one array is enough to store multiple data
->length starts from 1.
->array index starts from 0 to n-1 //n is length
->every index act as a variable name. so every index is a seperate memory block.
->how array indexes stored in memory:
0th index memory block is created randomly in the cpu in any of the portion.
but from 1st to n-1 th indexed memory blocks are stored consecutively with respect to previous memory block.
0th index present in LHS. all the other index are stored in RHS with respect to previous index.
 */

public class OneDimensionBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
    }
}