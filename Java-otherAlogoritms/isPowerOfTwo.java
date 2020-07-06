public class Solution{

     public static void main(String []args){
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPowerOfTwo(218));
     }
     
     public static boolean isPowerOfTwo(int n) {
         long i = 1;
         
         while(i < n) {
             i *= 2;
         }
         return i == n;
     }
}