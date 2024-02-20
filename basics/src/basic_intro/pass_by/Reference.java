package basic_intro.pass_by;

//note: in C programming we sent the memory address using pointer of variable. changing the sent data will affect the original
//note: we can achieve this in java. by using object. passing object reference and modifying data.
//in C programing:
// fun(int a) - pass by value
//fun(int &a) - pass by reference

//note: when passing basic_intro.array as arguments, always its object reference is passed so modification will affect the memory
public class Reference {
    static void passByReference(int[] a){  //receiving object reference instead of value of basic_intro.array
        a[0]=10;
        System.out.println(a[0]); //10
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        passByReference(a);
        System.out.println(a[0]); //10
    }
}
