import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.nio.file.*;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    IntStream.range(1, 10).forEach(System.out::println);

    IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x)); // skips 1 to 5, prints 6 to 9

    System.out.println(IntStream.range(1, 10).sum() // 45
    );

    // You can pass ints, floats, strings, objects to Stream.of()
    Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

    // 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};

    Arrays.stream(names)      //Same as stream.of(names)
      .filter(x -> x.startsWith("S"))
      .sorted()
      .forEach(System.out::println);

     // 6. average of squares of an int array
  Arrays.stream(new int[] {2, 4, 6, 8, 10})
    .map(x -> x * x)
    .average()
    .ifPresent(System.out::println);  // 44.0  

   // 7. Stream from List, filter and print
   List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
   people
   .stream()
   .map(String::toLowerCase)
   .filter(x -> x.startsWith("a"))
   .forEach(System.out::println);
 
  // 8. Stream rows from text file, sort, filter, and print
  Stream<String> bands = Files.lines(Paths.get("bands.txt"));
  bands
    .sorted()
    .filter(x -> x.length() > 13)
    .forEach(System.out::println);
  bands.close();

  // 9. Stream rows from text file and save to List
  List<String> bands2 = Files.lines(Paths.get("bands.txt"))
    .filter(x -> x.contains("jit"))
    .collect(Collectors.toList());
  
  bands2.forEach(System.out::println);

  // 10. Stream rows from CSV file and count
  Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
  int rowCount = (int)rows1
    .map(x -> x.split(","))
    .filter(x -> x.length == 3)
    .count();
    
  System.out.println(rowCount + " rows.");
  rows1.close();

  // 11. Stream rows from CSV file, parse data from rows
  Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
  rows2
    .map(x -> x.split(","))
    .filter(x -> x.length == 3)
    .filter(x -> Integer.parseInt(x[1]) > 15)
    .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
    
  rows2.close();


  }
}