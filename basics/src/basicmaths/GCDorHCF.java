package basicmaths;

public class GCDorHCF {
    //(10,5)->5 , (5,5) -> 5
    static int min(int n1,int n2){
        return n1<=n2?n1:n2;
    }
    static int bruteForce(int n1,int n2){
        int gcd=1;
        for (int i=1;i<=min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    static int optimalSolution(int n1,int n2){
        //Eucledian algorithm
        while (n1>0 && n2>0){
            if (n1>n2) n1=n1%n2;
            else n2=n2%n1;
        }
        return n1==0?n2:n1;
    }

    public static void main(String[] args) {
        System.out.println(bruteForce(15,6));
        System.out.println(bruteForce(10,20));
        System.out.println(optimalSolution(15,6));
        System.out.println(optimalSolution(10,20));
    }
}
