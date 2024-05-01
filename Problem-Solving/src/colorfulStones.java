import java.util.Scanner;

public class colorfulStones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String value = s.next();
        String instruction = s.next();
        int counter = 1;
        int x = 0;

        for (int i =0; i< instruction.length(); i++){
            if(value.toCharArray()[x] == instruction.toCharArray()[i]){
                counter++;
                x++;
            }
        }
        System.out.println(counter);
    }
}
