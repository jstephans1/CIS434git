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
