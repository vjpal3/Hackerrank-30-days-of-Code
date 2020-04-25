import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  /* Find occurances of 'a' in a string, repeated upto n characters */

  static long repeatedString(String s, long n) {
    if (s.equals("a")) {
      return n;
    }

    long count = 0;

    long multiples = n / s.length();
    long remainder = n % s.length();

    count = multiples * getCount(s, s.length());
    count += getCount(s, remainder);

    return count;
  }

  static long getCount(String s, long range) {
    long count = 0;

    for (int i = 0; i < range; i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }
    return count;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String s = scanner.nextLine();

    long n = scanner.nextLong();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long result = repeatedString(s, n);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
