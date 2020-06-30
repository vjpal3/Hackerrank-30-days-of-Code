import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // return minimum absolute difference between any pair of elements
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length -1; i++) {
            minDiff = Math.min(minDiff, Math.abs(arr[i] - arr[i+1]));
        }
        return minDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


int totalLuck = 0;
        List<Integer> importantContests = new ArrayList<>();

        for(int i = 0; i < contests.length; i++) {
            totalLuck += contests[i][0];
            if(contests[i][1] == 1) {
                importantContests.add(contests[i][1]);
            }
        }
        Collections.sort(importantContests);

        int mustWin = importantContests.size() - k;
        int luckToLose = 0;
        for(int i = 0; i < mustWin; i++) {
            luckToLose += importantContests.get(i);
        }
        
        return totalLuck - 2 * luckToLose;