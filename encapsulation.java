/*here only the method gets executed and values is just passed as the declaration in class is private */
public class encapsulation {
    private int value;
    public void setvalues(int x){
        value = x;
    }
    public int value(){
        return value;
    }
   
    }
 class show{
    public static void main(String[] args){
        encapsulation e = new encapsulation();
        e.setvalues(100);
        System.out.println(e.value());
}
 }
