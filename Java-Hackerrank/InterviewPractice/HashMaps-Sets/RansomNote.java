import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  static void checkMagazine(String[] magazine, String[] note) {
    Map<String, Integer> magazineMap = new HashMap<>();
    for (String word : magazine) {
      Integer frequency = magazineMap.get(word);
      if (frequency == null) {
        magazineMap.put(word, 1);
      } else {
        magazineMap.put(word, frequency + 1);
      }
    }

    Map<String, Integer> noteMap = new HashMap<>();
    for (String word : note) {
      Integer frequency = noteMap.get(word);
      if (frequency == null) {
        noteMap.put(word, 1);
      } else {
        noteMap.put(word, frequency + 1);
      }
    }

    boolean found = true;
    ;

    for (String word : noteMap.keySet()) {
      if (!magazineMap.containsKey(word) || magazineMap.get(word) < noteMap.get(word)) {
        found = false;
        break;
      }
    }

    System.out.println((found) ? "Yes" : "No");

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String[] mn = scanner.nextLine().split(" ");
    int m = Integer.parseInt(mn[0]);
    int n = Integer.parseInt(mn[1]);
    String[] magazine = new String[m];
    String[] magazineItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < m; i++) {
      String magazineItem = magazineItems[i];
      magazine[i] = magazineItem;
    }

    String[] note = new String[n];

    String[] noteItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      String noteItem = noteItems[i];
      note[i] = noteItem;
    }

    checkMagazine(magazine, note);
    scanner.close();
  }
}
