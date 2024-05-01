import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Summation_from_1toN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextInt();
        long sum = (N * (N+1))/2;
        System.out.println(sum);
    }
}
