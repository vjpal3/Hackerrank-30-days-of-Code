import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  /*
   * There is a collection of input strings and a collection of query strings. For
   * each query string, determine how many times it occurs in the list of input
   * strings.
   */
  static int[] matchingStrings(String[] strings, String[] queries) {
    int[] result = new int[queries.length];
    int index = 0;
    // for(String query : queries) {
    // int count = 0;

    // for(String str : strings) {
    // if(query.equals(str)) {
    // count++;
    // }
    // }
    // result[index++] = count;
    // }

    Map<String, Integer> map = new HashMap<>();
    for (String str : strings) {
      map.put(str, map.getOrDefault(str, 0) + 1);
    }
    for (String query : queries) {
      result[index++] = map.getOrDefault(query, 0);
    }
    return result;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int stringsCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String[] strings = new String[stringsCount];

    for (int i = 0; i < stringsCount; i++) {
      String stringsItem = scanner.nextLine();
      strings[i] = stringsItem;
    }

    int queriesCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String[] queries = new String[queriesCount];

    for (int i = 0; i < queriesCount; i++) {
      String queriesItem = scanner.nextLine();
      queries[i] = queriesItem;
    }

    int[] res = matchingStrings(strings, queries);

    for (int i = 0; i < res.length; i++) {
      bufferedWriter.write(String.valueOf(res[i]));

      if (i != res.length - 1) {
        bufferedWriter.write("\n");
      }
    }

    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
