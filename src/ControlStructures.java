import java.util.Scanner;

public class ControlStructures {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your age?");
    int age = scanner.nextInt();

    if (age < 18) {
      System.out.println("Sorry, you are not allowed to enter");
    } else if (age >= 18 && age <= 21) {
      System.out.println("Teenage mode active");
    } else {
      System.out.println("Please enter");
    }
  }
}
