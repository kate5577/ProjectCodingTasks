package Tasks;

public class Task9 {
    public static void main(String[] args) {

        //Write a java program to find the second largest
        //number in the array?

        int[] numbers = {57, 65, 61, 81, 82, 85, 75};
        int max = numbers[0];
        int sndmax=numbers[0];
        for (int num : numbers) {
            if (num > max) {
                sndmax=max;
                max = num;

            }else if(num>sndmax&&num!=max){
                sndmax=num;
            }

        }
        System.out.println(sndmax);

    }
}
