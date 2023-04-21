package Tasks;

public class Task8 {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int [] numbers ={57,65,61,81,82,85,75};
        int max=numbers[0];
        int min=numbers[0];
        for(int num:numbers){
            if(num>max){
                max=num;
            }else if(num<min){
                min=num;
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);

    }
}
