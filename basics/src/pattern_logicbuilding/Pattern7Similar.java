package pattern_logicbuilding;

public class Pattern7Similar {
    static void p2(int n){
        for (int i=1;i<=n;i++){
            //space columns
            for (int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            //numbers from start to 1
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //numbers after 1 to remaining numbers
            for (int j=2;j<=i;j++){ // not executed for 1st row bcoz 2<=1  is false
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p2(3);
        System.out.println("==========================");
        p2(5);
    }
}
