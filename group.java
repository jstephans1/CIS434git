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
public static int multiply(int num1, int num2){
        boolean negative;
        if(num1==0 || num2==0){
            return 0;
        }
        if((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)){
            negative=true;
        }
        else{
            negatuve=false;
        }

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        for(int i=0l i<num1; i++){
            result+=num2;
        }
        if(negative){
            return -result;
        }
        else{
            return result;
        }
        
    }
  
}
