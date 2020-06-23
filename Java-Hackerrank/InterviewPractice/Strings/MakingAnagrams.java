import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    /* If two strings  contain the same exact letters in the same exact frequency, they are anagrams
      Given two strings,  and , that may or may not be of the same length, 
      determine the minimum number of character deletions required to make  and  anagrams. 
      Any characters can be deleted from either of the strings.
    */

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] charCount = new int[26];
        int deletions  = 0;

        for(char c : a.toCharArray()) {
            charCount[c-'a'] += 1;
        }
        for(char c : b.toCharArray()) {
            charCount[c-'a'] -= 1;
        }
        for(int count : charCount) {
            deletions += Math.abs(count);
        }
        return deletions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int res = makeAnagram(a, b);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
