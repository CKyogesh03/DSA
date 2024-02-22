package pattern_logicbuilding;

/*
     *
    ***
   *****
  *******
 *********

 */
public class Pattern7 {
    static void p1(int n){
        for(int i=0;i<n;i++){
            //white space in LHS
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars in center
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for (int i=1;i<=n;i++){
            //space columns
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star columns
            for (int j=0;j<(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        p1(3);
        p2(3);
        System.out.println("==================================");
//        p1(5);
        p2(5);
    }
}
