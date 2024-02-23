package pattern_logicbuilding;

public class Pattern11 {
    static void p1(int n){
        int start;
        for (int i=1;i<=n;i++){
            start = i%2==0?0:1;
            for (int j=1;j<=i;j++){
                System.out.print(start);
//                start=(start==1)?0:1; // flipping
                start = 1-start; // flipping
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p1(5);
    }
}
