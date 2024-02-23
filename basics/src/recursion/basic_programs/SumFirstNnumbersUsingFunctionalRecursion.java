package recursion.basic_programs;

public class SumFirstNnumbersUsingFunctionalRecursion {
    static int sum(int n){ //add first n numbers
            if (n==0) return 0; // returns 0 if we pass 0 as n.
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(sum(n));
    }
}
