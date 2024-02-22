package pattern_logicbuilding;

public class Practice1 {
    public static void main(String[] args) {

        //it works normally
        for (int i=0;i<=1+0;i++){
            System.out.print("*"); //**
        }

        //infinite loop bcoz condition always true
        // dont use current loop variable with our for loop condition
        //we can use outer loop variable or any outer variable in the condition of inner loop
        for (int i=0;i<=i+0;i++){
            System.out.println("*");
        }


    }
}
