package pattern_logicbuilding;

/*

1      1
12    21
123  321
12344321

 */
public class Pattern12 {
    //here, n=4
    static void p1(int n){

        for (int i=1;i<=n;i++){
            //numbers
            for (int j=1;j<=i;j++){
                System.out.print(j); // j+" " // to provide space for alignment
            }
            //spaces
            int space=2*(n-i); // 2*n-2*i
            for (int j=1;j<=space;j++){
                System.out.print(" "); //" "+" " // 1 space needed if aligning our white space
            }
            //numbers
            for (int j=i;j>0;j--){ //reversing numbers
                System.out.print(j); //j+" "
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p1(4);
        System.out.println("==================sample================");
        p1(6);
    }
}
