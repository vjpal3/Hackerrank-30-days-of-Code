public class Recursion{

     public static void main(String []args){
         int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
         
        // iteratively get the combinations of elements such as : 1, 4, 7, 2, 5, 8, 3, 6, 9
        //  for(int i=0; i < arr.length; i++) {
        //      for(int j=0; j < arr[i].length; j++) {
        //              System.out.print(arr[j][i] + " ");
        //      }
        //  }
         
        printNumbers(arr, 0);
        
        //Total sum of numbers in the range
        // System.out.println(sumNumbers(5, 10));
     }
     
     public static void printNumbers(int[][] arr, int i) {
         if(i >= arr.length) {
             return;
         }
         for(int j = 0; j < arr[i].length; j++) {
             System.out.print(arr[j][i] + " ");
         }
         printNumbers(arr, i + 1);
     }
     
     public static int sumNumbers(int start, int end) {
         
         if(start == end) {
             return end;
         }
         else {
             return start + sumNumbers(start + 1, end);
         }
     }
}