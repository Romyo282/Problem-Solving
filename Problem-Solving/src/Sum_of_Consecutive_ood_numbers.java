import java.util.Scanner;

public class Sum_of_Consecutive_ood_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lines = s.nextInt();
        int sum = 0;
        for (int i = 0; i < lines; i++) {
            sum =0;
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int max = Math.max(num1,num2);
            int min = Math.min(num1,num2);
            for(int x = (min+1); x < max; x++){
                if(x % 2 != 0)
                {
                    sum += x;
                }
            }
            System.out.println(sum);
        }
    }
}


//    Scanner s = new Scanner(System.in);
//    int lines = s.nextInt();
//    int sum =0;
//        for(int i =0; i <lines; i++){
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
//        if(num1 == num2 || num1 == (num2+1) || num1 == (num2-1))
//        {
//        System.out.println("sum is : 0");
//        continue;
//        }
//        else if (num1 > num2)
//        {
//        for(; num1-1 > num2; num1--)
//        {
//        if ((num1-1) % 2 != 0)
//        sum += num1-1;
//        }
//        System.out.println("sum is :" + sum);
//        }
//        }