import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* Sample Input: Array of Strings(rocks) - [abcdde, baccd, eeabg]
Sample Output: 2
Explanation: Only  a and b are gemstones because they are the only types that occur in every String(rock).
*/

public class Solution {
  // Complete the gemstones function below.
  static int gemstones(String[] arr) {
    Set<String> mineralsSet = new HashSet<>(Arrays.asList(arr[0].split("")));
    for (int i = 1; i < arr.length; i++) {
      mineralsSet.retainAll(Arrays.asList(arr[i].split("")));
    }
    return mineralsSet.size();
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String[] arr = new String[n];

    for (int i = 0; i < n; i++) {
      String arrItem = scanner.nextLine();
      arr[i] = arrItem;
    }

    int result = gemstones(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
