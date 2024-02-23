package recursion.maintainData;

public class MaintainGlobally {
    static int start,end;
    static void f(){
        if (start>end)
            return;
        System.out.println(start);
        start++;
        f();
    }
    public static void main(String[] args) {
        start=1;
        end=5;
        f();
        System.out.println("at last start value is : "+start); //6
    }
}
