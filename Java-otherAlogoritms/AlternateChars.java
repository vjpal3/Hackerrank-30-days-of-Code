import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*You are given a string containing characters A and B only. Your task is to change it into a string such that there are no matching adjacent characters. 
To do this, you are allowed to delete zero or more characters in the string. Your task is to find the minimum number of required deletions.
*/
public class Solution {

  // Complete the alternatingCharacters function below.
  static int alternatingCharacters(String s) {

    char[] charArray = s.toCharArray();
    int deleteCount = 0;

    for (int i = 1; i < charArray.length; i++) {
      if (charArray[i - 1] == charArray[i]) {
        deleteCount++;
      }
    }
    return deleteCount;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int qItr = 0; qItr < q; qItr++) {
      String s = scanner.nextLine();

      int result = alternatingCharacters(s);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();
    }

    bufferedWriter.close();

    scanner.close();
  }
}
