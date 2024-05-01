import java.util.Scanner;

public class search_in_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int [][]arr = new int[row][col];


        for (int i = 0; i <row; i++){
            for(int x = 0; x <col; x++)
            {
                arr[i][x] = s.nextInt();
            }
        }
        int stopping = 0;
        int search = s.nextInt();
        for (int i = 0; i <row; i++){
            for(int x=0; x <col; x++)
            {
                if (arr[i][x] == search)
                {
                    stopping = 1;
                    break;
                }
            }
            if (stopping == 1){
                break;
            }
        }
        if (stopping == 1){
            System.out.println("will not take num");
        }
        else
            System.out.println("will take num");


    }
}
