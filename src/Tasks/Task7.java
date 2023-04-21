package Tasks;

public class Task7 {
    public static void main(String[] args) {

        //Write a Java Program to print the first 10 numbers of
        //Fibonacci series.

        int a=1;
        int b=1;
        int sum=0;

        for(int i=1;i<=10;i++){
            sum=a+b;
            System.out.print(a+" ");
            a=b;
            b=sum;

        }


    }
}
