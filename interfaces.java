/*Interface is just like clss which contains only abstract method 
 implements keyword is used to achieve interface
 interface methods are by default public and abstract
 interface variables are by default public static main
 interface method must be overriden inside the imnplementing class
*/
import java.util.Scanner;;
interface interfaces{
  void input();
  void output();
} 
class dev implements interfaces{
  String name; double sal;
  public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the username");
    name = sc.nextLine();
    System.out.println("Enter salary");
    sal = sc.nextDouble();
  }
public void output(){
  System.out.println(name);
  System.out.println(sal);
}
}
class show{
  public static void main(String[] args){
    interfaces in = new dev();
    in.input();
    in.output();
  }
}