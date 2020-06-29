import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Kata {
  public static int[][] twosDifference(int[] array) {
    Arrays.sort(array);
    List<int[]> result = new LinkedList<>();
    
    for(int item : array) {
      int search = item + 2;
      if(Arrays.binarySearch(array, search) >= 0) {
        result.add(new int[] {item, search});
      }
    }
    return result.toArray(new int[][] {});
  }
}