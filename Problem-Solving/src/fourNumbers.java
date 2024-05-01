import java.util.Scanner;

public class fourNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long sum = 1;
        for(int i = 0; i <4; i++){
            int num= s.nextInt();
            if (num > 0 || num < Math.pow(10,4))
                sum *= (long)num;
        }
        System.out.println(sum);
    }
}
