/*in this as the first class has not implemented both the methods 
 so  the class will be abstract and cannot be initiated
 as a result we create a new class where it is completed and as well as
  we use complete the method and class is extended from the abstract class
 */
interface interface3{
  void webdesign();
  void webdeveloper();
 }
 abstract class rajtech implements interface3{
  @Override
  public void webdesign(){
    System.out.println("form, button, navbar");
  }

 }
 class rahultech extends rajtech{
  @Override
  public void webdeveloper(){
    System.out.println("Div, forms, paragraph");
  } }
 class show{
  public static void main(String[] args){
    rahultech r = new rahultech();
    r.webdesign();
    r.webdeveloper();
  }
 }