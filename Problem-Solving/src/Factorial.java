import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long number = s.nextLong();
        long result = fact(number);

        System.out.println(result);


    }
    public static long fact(long num) {
        if (num == 0) return 1;
        else
            return num * fact(num - 1);
    }
}


