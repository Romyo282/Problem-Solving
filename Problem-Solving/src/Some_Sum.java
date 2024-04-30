import java.util.Scanner;
public class Some_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int limit1 = s.nextInt();
        int limit2 = s.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (i < 10) {
                if (i >= limit1 && i <= limit2) {
                    result += i;
                }
            } else {
                int newnum = i;
                int sum = 0 ;
                while (newnum != 0) {
                    int digit = newnum%10;
                    sum += digit;
                    newnum /= 10;
                }
                if (sum >= limit1 && sum <= limit2){
                    result +=i;
                }
            }
        }
        System.out.println("Result is " + result);

    }
}