package recursion.Linear_and_ReverseLogic;

//print N to 1
public class Reverse {
    static void f(int start,int end){
        if (start<end)
            return;
        System.out.println(start);
        f(start-1,end); //decrementing start
    }

    public static void main(String[] args) {
        f(3,1);
    }
}
