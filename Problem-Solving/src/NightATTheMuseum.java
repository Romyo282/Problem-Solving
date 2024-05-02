import java.util.Scanner;

public class NightATTheMuseum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = 97;
        int moves = 0;
        String word = s.next();
        // z e u s
        for (int i = 0; i < word.length(); i++) {
            int result = Math.abs(word.toCharArray()[i] - start);

            if (result <= 13) {
                moves += result;
            } else {
                moves += (26 - result);
            }
            start = word.toCharArray()[i];
        }
        System.out.println(moves);

    }
}
