import java.util.Scanner;
//Reverse the number which user enter.
public class digits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of num  : ");
        int size = s.nextInt();

        for (int i = 0; i <size; i++){
            System.out.print("\nenter value : ");
            int value = s.nextInt();
            if (value == 0) {
                System.out.println(0);
                continue;
            }
            while (value != 0)
            {
                int num = value % 10;
                System.out.print(num + " ");
                value /= 10;
            }

        }
    }
}
