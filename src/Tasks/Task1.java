package Tasks;

public class Task1 {
    public static void main(String[] args) {

        //Create a program that uses an array to store a list of
        //temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.

            int [] temperatures ={57,65,61,81,82,85,75};
            int highest=temperatures[0];
            int lowest=temperatures[0];
            for(int num:temperatures){
                if(num>highest){
                    highest=num;
                }
                if(num<lowest){
                    lowest=num;
                }
            }
        System.out.println("The highest temperature is"+" "+highest);
        System.out.println("The lowest temperature is"+" "+lowest);




    }
}
