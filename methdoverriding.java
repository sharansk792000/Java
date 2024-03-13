/*When we write a method in super class and sub class in such a way that the method name and parameters are same called method overriding 
 we cannot perform method overriding without inheritance
*/
public class methdoverriding {
    void draw(){
        System.out.println("No shape");
    }
    
}
class square extends methdoverriding{
    @Override
    void draw(){
        super.draw(); //calls super class method, to call super class
        System.out.println("This is a square");
    }

}
 class show{
    public static void main(String[] args){
        methdoverriding m = new square();
        m.draw();
    }
}
