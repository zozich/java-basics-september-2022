import java.util.Arrays;

public class ArraysPractice {
  public static void main(String[] args) {
    int i = 10;
    int[] arr = new int[10];
    System.out.println(Arrays.toString(arr));

    for (int j = 0; j < arr.length; j++) {
      arr[j] = j;
    }

    System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[5];
    Arrays.fill(arr2, 3);
    System.out.println(Arrays.toString(arr2));

    int[][] arr3 = new int[5][5];
    System.out.println(Arrays.deepToString(arr3));
  }
}
