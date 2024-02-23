package pattern_logicbuilding;

//pending
public class Pattern18 {
    static void p1(int n){
        for (int i=n-1;i>=0;i++){
            char ch= (char) ('A'+i);
            for (int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p1(5);
    }
}
