
public class MoreWritingJavaMethods {

 public static void main(String[] args) {
  System.out.println(addStringS2AtN("FirstLast", "Middle", 5));
  System.out.println(byteValue("11111111"));
  
 }
 
 public static String addStringS2AtN(String s1, String s2, int n)
 {
  return s1.substring(0, n) + s2 + s1.substring(n);
  
 }
 
 public static int byteValue(String str) {
  return Integer.parseInt(str, 2);
 }
 

}
