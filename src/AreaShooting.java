import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AreaShooting {
  public static void main(String[] args) {
    Random random = new Random();
    int row = random.nextInt(5);
    int col = random.nextInt(5);

    String[][] field = new String[5][5];
    for (int i = 0; i < field.length; i++) {
      Arrays.fill(field[i], "-");
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the coordinates:");
    boolean continueGuess = true;

    while (continueGuess) {
      int guessRow = scanner.nextInt() - 1;
      int guessCol = scanner.nextInt() - 1;

      if (guessRow == row && guessCol == col) {
        System.out.println("Congratulations! You have won");
        field[guessRow][guessCol] = "X";
        continueGuess = false;
      } else {
        System.out.println("Please try again");
        field[guessRow][guessCol] = "*";
      }

      System.out.println("  | 1 | 2 | 3 | 4 | 5 |");
      for (int i = 0; i < 5; i++) {
        System.out.print((i + 1) + " | ");
        for (int j = 0; j < 5; j++) {
          System.out.print(field[i][j] + " | ");
        }
        System.out.println();
      }
    }
  }
}
