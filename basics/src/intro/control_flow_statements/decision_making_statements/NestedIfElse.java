package intro.control_flow_statements.decision_making_statements;

public class NestedIfElse {
    //eligible for job
    public static void main(String[] args) {
        int age=60;
        if (age<18)
            System.out.println("Not Eligible for Job");
        else if(age>=18){
            if (age<55)
                System.out.println("Your Eligible for Job");
            else
                System.out.println("Your Eligible but retirement soon");
        }
    }
}