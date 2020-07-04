public class TwoDArrayIteration{

  public static void main(String []args){
      int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

      int length = arr.length;
      int range = length * length;

      for(int i = 0; i < range; i++) {
        int row = i % length;
        int col = i / length;
        System.out.print(arr[row][col] + " ");
      }

  }
}