package Tasks;

public class Task10 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from
        //an Array of Strings?
        String [] names={"Jacob","Lean","Pavel","Kate","Cris","Lean"};
        for(int j=0;j< names.length;j++){
            for(int i=j+1;i< names.length;i++){
                if(names[j]==names[i]){
                    System.out.println("Duplicate elements: "+names[i]);
                }
            }
        }


    }
}
