public class group {
    public static void main(String[] Args) {
    }
  
    static String OmPatelInfo() {
    return ("Om Patel CSU ID: 2772347");
    }
    
    static String getGroupMembers() { 
      return ("Elijah" + "Jacob" + "Om" + "Ahmad" + "");
    }
  
    public static String jacobInfo(){
      return("Jacob Stephans - 2805598");
    }
  
    public static String AhmadInfo(){
      return ("Ahmad Rahman 2739398");
    }
  
    public static String ElijahInfo(){
      return ("Elijah Gulley 2806198");
    }
  
    public static int divide(int num1, int num2){
      if(num2==0){
        throw new ArithmeticException("Cannot Divide by zero");
      }
      int result=0;
      int absolute1 = Math.abs(num1);
      int absolute2 = Math.abs(num2);
      
      //repeated subtraction
      while(absolute1>=absolute2){
        absolute1=absolute1-absolute2;
        result++;
          }
      if((num1<0 && num2 >1) || (num1>0 && num2 <0)){
        result = -result;
      }
      return result;
    }
     
  
  public static int multiply(int num1, int num2){
          boolean negative;
          int result = 0;
          if(num1==0 || num2==0){
              return 0;
          }
          if((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)){
              negative=true;
          }
          else{
              negative=false;
          }
  
          num1 = Math.abs(num1);
          num2 = Math.abs(num2);
          for(int i=0; i<num1; i++){
              result+=num2;
          }
          if(negative){
              return -result;
          }
          else{
              return result;
          }
          
      }
  
    public static int power(int num1, int num2) {
          //can't handle negative exponents if the return type is int
          if (num2 < 0) {
              throw new IllegalArgumentException("Exponent cannot be negative");
          }
          int result = 1;
          for (int i = 0; i < num2; i++) {
              result = multiply(result, num1);
          }
          return result;
      }
  
  }
