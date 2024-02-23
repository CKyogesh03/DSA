package recursion.maintainData;

//data stored in local variables are erased after the execution frame destroyed
public class LocalScopeUnderstanding1 {
    static int start,end;

    static void f(int start,int end){ // data received in local variable. so data is maintained by local variables
        if (start>end)
            return;
        System.out.println(start);
        start++;
        f(start,end);
    }
    public static void main(String[] args) {
        start=1;
        end=5;
        f(start,end);
        System.out.println("global variable start value is : "+start); //1 // bcoz functions used their same named local variables
    }
}
