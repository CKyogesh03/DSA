package pattern_logicbuilding;

public class Pattern3 {
    static void p1(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p1(3);
        System.out.println("==================================");
        p1(5);
    }
}
