package pattern_logicbuilding;

/*

 ****
 ****
 ****
 ****

 */
public class Pattern1 {
//note: every single row have all the columns.
    //remember -> one to many mapping -> one object have multiple related object -> one row have multiple columns
    static void p1(){
        for (int i=1;i<=4;i++){ //outer loop gives us the row to align columns
            for (int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p2(){
        for (int i=0;i<=3;i++){ // rows=0,1,2,3
            for (int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //build logic based on given number(row count)
    static void p4(int n){
        for (int i=0;i<n;i++){      //if n=4  rows = 0,1,2,3
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p3(int n){
        for (int i=1;i<=n;i++){      //if n=4  rows = 1,2,3,4
            for (int j=1;j<=n;j++){  //column = 1,2,3,4
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //test cases checking
        System.out.println("sample test case 1");
        p3(2);
        System.out.println("===========================================");
//        p1();
//        p2();
        p3(4);
//        p4(4)

        //test cases
//        p3(2);
//        p3(10);
    }
}
