import java.util.Scanner;

public class Yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }

        int result = 0;
        for (int i = 0; i < size; i++) {
            int pointer = 0;
            for (int x = 0; x < size; x++) {
                if (nums[i] == nums[x]) {
                    pointer++;
                }
                if (pointer > result) {
                    result = pointer;
                }
            }
        }
        if (size % 2 == 0) {
            if (result <= (size / 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (result <= (size / 2)+1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
