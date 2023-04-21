package Tasks;

public class Task3 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store
        //odd and even numbers. Develop a program which will
        //identify/print the even numbers only.
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        for(int[]arr:arr2D){
            for(int num:arr){
                if(num%2==0){
                    System.out.print(num+" ");

                }
            }

        }


    }
}
