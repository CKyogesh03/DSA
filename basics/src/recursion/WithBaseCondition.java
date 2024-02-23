package recursion;

public class WithBaseCondition {
    static int count=0;
    static void f(){
        if (count==3)
            return;
        System.out.println(count);
        count++;
        f();
    }
    public static void main(String[] args) {
        f();
    }
}
