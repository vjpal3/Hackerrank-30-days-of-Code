public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        int count = 0;
        int maxCount = 0;

        while(n > 0) {
            if(n % 2 == 1) {
                count ++;
            }
            else
                count = 0;

            maxCount = Math.max(count, maxCount);    
            n = n / 2;
        } 
        System.out.println(maxCount);         
    }
}