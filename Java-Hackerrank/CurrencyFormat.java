public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String us = formatter.format(payment);

        formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formatter.format(payment);

        formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatter.format(payment);

        formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatter.format(payment);

        System.out.println("US: " + us); 
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}