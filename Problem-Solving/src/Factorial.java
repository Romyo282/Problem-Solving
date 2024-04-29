import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num : ");
        long number = s.nextLong();
//        long result = fact(number);
        if (number == 1 || number == 0){
            System.out.println("no");
        }
        else
            System.out.println("yes");



    }
//    public static long fact(long num) {
//        if (num == 0) return 1;
//        else
//            return num * fact(num - 1);
//    }
}


