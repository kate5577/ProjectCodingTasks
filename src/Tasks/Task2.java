package Tasks;

public class Task2 {
    public static void main(String[] args) {

        //Create an array of integer values. After the array is
        //created, calculate the sum of all stored elements in
        //that array.
        int [] numbers={56,77,57,88,90,12};
        int sum=0;
        for(int num:numbers){
            sum=sum+num;
        }

        System.out.println(sum);



    }
}
