package pattern_logicbuilding;
//reverse
/*

 *********
  *******
   *****
    ***
     *

 */
public class Pattern8ReversePattern7 {
    static void p1(int n){
        for (int i=0;i<n;i++){
            //space columns
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //star columns
            for (int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for (int i=1;i<=n;i++){
            //space columns
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
//            //star columns // pending formula
//            for (int j=1;j<2*n;j++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p1(3);
        System.out.println("================================");
        p1(5);
    }
}
