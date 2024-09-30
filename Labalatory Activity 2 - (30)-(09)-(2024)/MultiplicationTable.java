import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Table = new Scanner(System.in);
        int size = 0;

        System.out.print("Enter the size of the multiplication table: ");
        size = Table.nextInt();

        int [][] number = new int[size + 1][size + 1];

        System.out.println("Multiplication Table: ");
                for (int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                number[i][j] = i * j;
                System.out.printf("%4d", number[i][j]);
            }
            System.out.println();
        }
        Table.close();
    }
}