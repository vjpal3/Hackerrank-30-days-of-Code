import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(List<Integer> query : queries) {
            if(query.get(0) == 1) {
                //map.put(query[1], map.getOrDefault(map.get(query[1]), 0) + 1);
                if(map.containsKey(query.get(1))) {
                    map.put(query.get(1), map.get(query.get(1)) + 1);
                }
                else {
                    map.put(query.get(1), 1);
                }
            }
            else if(query.get(0) == 2) {
                if(map.containsKey(query.get(1))) {
                    if(map.get(query.get(1)) <= 1) {
                        map.remove(query.get(1));
                    }
                    else {
                        map.put(query.get(1), map.get(query.get(1)) - 1);
                    }
                   
                }

            }
            else if(query.get(0) == 3) {
                if(map.containsValue(query.get(1))) {
                    result.add(1);
                }
                else {
                    result.add(0);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
