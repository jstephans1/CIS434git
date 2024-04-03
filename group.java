public class group {
  public static void main(String[] Args) {
  }

  static String OmPatelInfo() {
  return ("Om Patel CSU ID: 2772347");
  }
  
  static String getGroupMembers() { 
    return ("Elijah" + "" + "" + "" + "");
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

  public int divide(int num1, int num2)
  {
    if (num2 == 0){ throw new ArithmeticException(); }
    int rem = num1 - num2;
    if (rem < 0) { throw new ArithmeticException(); }
    if (rem == 1){ return 1; }
    rem = num1;
    int result = 0;
    while (rem >= num2)
    {
      rem -= num2;
      result++;
    }
    if (rem != 0) { throw new ArithmeticException(); }
    return result;
  }

  public int multiply(int num1, int num2)
  {
    return 0;
  }

  public int power(int num1, int num2)
  {
    return 0;
  }
  
}
