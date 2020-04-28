import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  /*
   * Given two strings, determine if they share a common substring. A substring
   * may be as small as one character. For example, the words "a", "and", "art"
   * share the common substring . The words "be" and "cat" do not share a
   * substring.
   */
  static String twoStrings(String s1, String s2) {
    Set<Character> set1 = new HashSet<>();
    for (char c : s1.toCharArray()) {
      set1.add(c);
    }
    Set<Character> set2 = new HashSet<>();
    for (char c : s2.toCharArray()) {
      set2.add(c);
    }

    set1.retainAll(set2);
    return set1.isEmpty() ? "NO" : "YES";
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int qItr = 0; qItr < q; qItr++) {
      String s1 = scanner.nextLine();

      String s2 = scanner.nextLine();

      String result = twoStrings(s1, s2);

      bufferedWriter.write(result);
      bufferedWriter.newLine();
    }

    bufferedWriter.close();

    scanner.close();
  }
}
