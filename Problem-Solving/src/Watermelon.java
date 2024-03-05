import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter wight of watermelon : ");
        int num = s.nextInt();

        if (num == 2) {
            System.out.println("NO");
            return;
        }
        if (num % 2 == 0) {
            System.out.println("YES");
        }

        else  {
            System.out.println("NO");
        }
    }
}
