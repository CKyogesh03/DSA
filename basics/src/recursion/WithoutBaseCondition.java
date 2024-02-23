package recursion;

//StackOverflowError occurs
public class WithoutBaseCondition {
    static int count=0;
    //example1
    static void f(){
        System.out.println(1);
        f();
    }

    //example2
    static void f2(){
        System.out.println(count);
        count++;
        f2();
    }

    public static void main(String[] args) {
//        f();
        f2();
    }
}
