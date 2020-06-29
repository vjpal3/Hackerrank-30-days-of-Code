public class Exoponentiation{

  public static void main(String []args){
     
    //  System.out.println(recursivePower(2, -3));
     // System.out.println(calculatePower(2, -3));
     System.out.println(efficientPower(2, 5));
  }

  public static long efficientPower(int base, int exp) {
    if(exp == 0)   
        return 1;
    if(exp == 1) 
        return base;
    
    long result = efficientPower(base, exp/2);
    
    if(exp % 2 == 0) 
        return result * result;
    else 
        return result * base * result;
    
 } 
  
  public static double calculatePower(double base, double exponent) {
      double result = 1;
      
      while (Math.abs(exponent) >= 1) {
          if(exponent < 0) { 
              result /= base;
              exponent++;
          }
          else {
              result *= base;
              exponent--;
          }
      }
      return result;
  }
  
  public static double recursivePower(double base, double exponent) {
     if(Math.abs(exponent) == 1) {
         if(exponent < 0) {
             return 1 / base;
         }
         else {
             return base;
         }
      }
      else {
          if(exponent < 0) {
             return  (1 / base) *  recursivePower(base, exponent+1);
         }
         else {
             return base * recursivePower(base, exponent-1);
         }
          
      }
      
     //  if(exponent == 1) {
     //      return base * exponent;
     //  }
     //  else {
     //      return base * recursivePower(base, exponent-1);
     //  }
  }
}