package basicmaths;

public class PrimeNumber {
    static void bruteForce(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        String result=(count==2)?"Prime number":"Not a Prime number";
        System.out.println(result);
    }
    static void optimisedSolution(int n){
        int count=0;
        for (int i=1;i*i<=n;i++){
            if (n%i==0){
                count++;
                if ((n/i)!=i) count++; //36/6 -> 6!=6 -> no increment count if left and multiple is same

            }
        }
        String result=(count==2)?"Prime number":"Not a Prime number";
        System.out.println(result);
    }

    public static void main(String[] args) {
        bruteForce(7);
        bruteForce(6);
        System.out.println("=================");
        optimisedSolution(7);
        optimisedSolution(6);
    }
}
