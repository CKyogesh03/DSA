package recursion.maintainData;

// using local variables
public class MaintainLocally {
    static void f(int start,int end){
        if (start>end)
            return;
        System.out.println(start);
        start++;
        f(start,end);
    }
    public static void main(String[] args) {
        int start=1;
        int end=5;
        f(start,end); //this is seperate operation
        System.out.println("at last start value is : "+start);//1 //this is seperate operation
    }
}
