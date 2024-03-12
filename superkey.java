/* super key refers to super class
 sub class will call super class variable, method and constructor
  -- when superclass and sub class variable and method name both are same then only it can be used
  -- to remove the confusion between super class and sub class variables and method that have same name we user super keyword
  can be implemented in 3 ways 
    >>variable
    >>method
    >>constructor
   by default super will be added in default type constructor
 */
public class superkey {
    int a = 10;
     superkey(int a){
        System.out.println("im superkey"+a);
    }
    void show(){ //method
        System.out.println("hello  boiii");
    }
}
class sup extends superkey{
    int a = 20;
     sup(){
        super(100);
        System.out.println("im sup");
    }
    void show(){
        super.show();
        System.out.println("The number is "+a);
        System.out.println("The number is "+super.a); //variable
    }
    // public static void main(String[] args){
    //     sup ref = new sup();
    //     ref.show();
    // }
}
class displaynum{
    public static void main(String[] args){
        sup ref = new sup();
        
    }
}
