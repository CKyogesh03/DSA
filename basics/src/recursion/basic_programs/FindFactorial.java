package recursion.basic_programs;

public class FindFactorial {
    static int fact(int n){
        if (n==0) return 0; //if we pass 0 directly
        return n*fact(n-1); //calculate from the last function in call stack
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(fact(n));
    }
}
