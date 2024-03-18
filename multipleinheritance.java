/*Multiple inheritance using interface
 Java implements multiple inheritance using interface
 bcos interface contains only abstract method
 which implementation is provided by sub classes
 */
interface multipleinheritance{
  void method1();
 }
 interface multipleinheritance1{
  void method2();
 }
class multiple implements multipleinheritance,multipleinheritance1 {
  public void method1(){
    System.out.println("1st method");
  }
  public void method2(){
    System.out.println("Step2");
  }
  public static void main(String[] args){
    multiple m = new multiple();
    m.method1();
    m.method2();

  }
} 