package Tasks;

public class Task4 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program
        //which will calculate the sum of even and odd numbers
        //for that array.
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int sumOdd=0;
        int sumEven=0;
        for(int[]arr:arr2D){
            for(int num:arr){
                if(num%2==0){
                    sumEven=sumEven+num;
                }
                if(num%2!=0){
                    sumOdd=sumOdd+num;
                }
            }
        }
        System.out.println("Sum of even is "+sumEven);
        System.out.println("Sum of odd is "+sumOdd);


    }
}
