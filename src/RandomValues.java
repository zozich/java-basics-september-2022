import java.util.Random;

public class RandomValues {
  public static void main(String[] args) {
    Random random = new Random();
    int number = random.nextInt(55) + 32;

    System.out.println(number);

    System.out.println(random.nextInt(1000));
    System.out.println(random.nextInt(1000));
    System.out.println(random.nextInt(1000));
    System.out.println(random.nextInt(1000));
  }
}
