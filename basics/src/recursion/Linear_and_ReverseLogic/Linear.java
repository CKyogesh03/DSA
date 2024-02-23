package recursion.Linear_and_ReverseLogic;

//print 1 to N
public class Linear {
    static void f(int start,int end){
        if (start>end)
            return;
        System.out.println(start);
        f(start+1,end); //incrementing start
    }

    public static void main(String[] args) {
        f(1,3);
    }
}
