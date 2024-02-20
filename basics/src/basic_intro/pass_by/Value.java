package basic_intro.pass_by;

public class Value {
    public static void m1(int a,String s) {
        a=a+10; //changing passed value
        s="changed";
    }
    public static void main(String[] args) {
        int a = 10;
        String s="yogesh";
        //call by value
        m1(10,s); // copy of value is sent so original memory is not sent. // modifying copy will not affect original value
        System.out.println(a);
        System.out.println(s);

    }
}
