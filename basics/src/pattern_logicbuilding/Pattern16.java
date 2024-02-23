package pattern_logicbuilding;

public class Pattern16 {
    static void p1(int n){
        for (int i=0;i<n;i++){
            char ch= (char) ('A'+i);
            for (int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
    static void p2(int n){
        //note: char+int = int . so typecast needed
        for (int i=1;i<=n;i++){
            char ch= (char) ('A'+i-1);  // if i start from 0 then  minus one is not needed
            for (int j=1;j<=i;j++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        p1(5);
        p2(5);
    }
}
