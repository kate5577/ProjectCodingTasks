package Tasks;

public class Task5 {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a
        //temporary variable?

        int a=7;
        int b=15;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" After swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }
}
