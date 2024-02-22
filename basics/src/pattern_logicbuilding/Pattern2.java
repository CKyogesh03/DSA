package pattern_logicbuilding;

public class Pattern2 {
    static void p1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void p2(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("sample test case");
//        p1(3);
        p2(3);
        System.out.println("==============================================");
//        p1(5);
        p2(5);
    }
}
