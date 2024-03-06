/*Constructor can be private
 but constructor cannot be called by different class/outside the class */
public class privateconst {
    int a; double b; String c;
    private privateconst(){
        a = 10;
        b = 20.44;
        c = "Hi bro";
        System.out.println(a+" "+b+" "+c);
    }
    
    public static void main(String[] args){
        privateconst ref = new privateconst();
        // ref.copyconst();
    }
}
