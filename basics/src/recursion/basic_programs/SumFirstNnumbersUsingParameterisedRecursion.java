package recursion.basic_programs;

public class SumFirstNnumbersUsingParameterisedRecursion {
    static void sum(int s,int e,int sum){
        if (s>e){
            System.out.println(sum);
            return;
        }
        sum(s+1,e,sum+s); // incremented in current block then passed to this method

        //find why below code gives wrong answer // adding next number to it
//        s=s+1;sum=sum+s;
//        sum(s,e,sum);
    }

    public static void main(String[] args) {
        sum(1,3,0);
    }
}
