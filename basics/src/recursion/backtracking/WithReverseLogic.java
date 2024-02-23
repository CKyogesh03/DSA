package recursion.backtracking;

public class WithReverseLogic {
    static void f(int start,int end){
        if (start>end)
            return;
        f(start+1,end); //decrementing start // innermost recursive function gets executed first.
        System.out.println(start);
    }

    public static void main(String[] args) {
        f(1,3);
    }
    /*
    3 - printed by 3rd function in a call stack
    2 - printed by 2nd function in a call stack
    1 - printed by 1st function in a call stack
    */
}