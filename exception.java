/*
 * exception is where an unwanted error occurs
 * keywords used are 
 * try 
 * catch
 * throw
 * throws
 * finally
 * very good to print error or any doubts
 */
public class exception {
  public static void main(String[] args) {
    int a = 10;
    int b = 0, c;
    try {
      c = a / b;
      System.out.println(c);
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}