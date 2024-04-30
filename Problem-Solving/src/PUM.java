import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter num of lines : ");
        int lines = s.nextInt();
        int counter = 1;
        for(int i = 0; i < lines; i++)
        {
            while(counter%4 != 0){
                System.out.print(counter + " ");
                counter++;

            }
            System.out.println("PUM");
            counter++;

        }

    }
}
