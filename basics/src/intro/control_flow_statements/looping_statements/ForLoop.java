package intro.control_flow_statements.looping_statements;

/*
    to run the same statement multiple times. duplicate codes no needed. eg: print name 5 times
    scope:
    variables declared inside for loop - local scope. processed data not accessed from outside the scope. like next codes
    variables declared outside for loop - can process data in forloop. then next codes can access the processed data.
    note: when loops completed. the value of variable is extra by 1. to false the condition.
    it is same for all loops.
 */
public class ForLoop {
    static void bruteForce(){
        System.out.println("Yogesh");
        System.out.println("Yogesh");
        System.out.println("Yogesh");
    }
    static void better(){
        for (int i=1;i<=3;i++){
            System.out.println("Yogesh");
        }
    }
    public static void main(String[] args) {
//        bruteForce();
        better();
    }
}