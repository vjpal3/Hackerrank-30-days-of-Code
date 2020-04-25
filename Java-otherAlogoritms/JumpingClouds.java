import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  /*
   * c[0] = c[n-1] = 0; c[i] -> {0, 1} Avoid number 1 and count number of jumps to
   * reach end of the array.
   */
  // Complete the jumpingOnClouds function below.
  static int jumpingOnClouds(int[] c) {
    int jumps = 0;
    int n = c.length;
    int i = 0;
    while (i < n - 1) {
      if (i + 2 >= n || c[i + 2] == 1) {
        i++;
      } else {
        i += 2;
      }
      jumps++;
    }
    return jumps;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }

    int result = jumpingOnClouds(c);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
