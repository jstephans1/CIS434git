public class group {
  public static void main(String[] Args) {
  }

  static String OmPatelInfo() {
  return ("Om Patel CSU ID: 2772347");
  }
  
  static String getGroupMembers() { 
    return ("Elijah" + "Jacob" + "" + "" + "");
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
      result++
        }
    if((num1<0 && num2 >1) || (num1>0 && num2 <0)){
      result = -result;
    }
    return result
  }
}
