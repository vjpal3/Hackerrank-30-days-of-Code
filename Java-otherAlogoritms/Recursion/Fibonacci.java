import java.util.*;

public class Solution {
    public static List<Integer> fibList = new ArrayList<>(Arrays.asList(0, 1));

    public static int fibonacci(int n) {
         
        // if(n == 0)  
        //     return 0;
        // if(n == 1)
        //     return 1;
        if(n < fibList.size()) 
            return fibList.get(n);    
        
        int fibValue = fibonacci(n-1) + fibonacci(n-2);
        fibList.add(n, fibValue);
        return fibValue;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
