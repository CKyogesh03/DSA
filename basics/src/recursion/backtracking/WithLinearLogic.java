package recursion.backtracking;
//back - means statements executed after the recursive function completes.
// print linearly 1 to N
//printing statement placed after the recursive function call.
//so printing statement executed after the previous recursion function completes its execution.
//this printing statement uses the data that is processed in the previous recursive function.
//note: when using backtracing recursive function have problem the upcoming statements are not executes.
public class WithLinearLogic {
    static void f(int start,int end){
        if (start<end)
            return;
        f(start-1,end); //decrementing start // innermost recursive function gets executed first.
        System.out.println(start);
    }

    public static void main(String[] args) {
        f(3,1);
    }
    /*
    1 - printed by 3rd function in a call stack
    2 - printed by 2nd function in a call stack
    3 - printed by 1st function in a call stack
    */
}
