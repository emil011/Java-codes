import java.util.Random;

public class MilkTask {

    public static void main(String[] args){
    
        Random rnd =  new Random();
        int[] students = new int[100];
        int milk = 200, count = 1, max = 40, min = 21;

        for(int i = 0;i < students.length;i++) {
        
            students[i] = rnd.nextInt((max - min) + 1) + min;
            
            if(students[i] <= 30){
            
                count++;
            }
        }

        int glasses = 200*count;

        int packets = glasses / 900;

        if(glasses > 900){
        
            packets++;
        }

        System.out.println("Less than 30 kg:" +count+ " Milk packets:" + packets + " Cackes:" + count);

    }
}
