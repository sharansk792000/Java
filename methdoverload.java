/* when a class contains more than one method with same name and different types of parameters called as method overload */
public class methdoverload {
    int add(){
        int a = 100;
        int b = 20;
        int c;
        c = a+b;
        return c;
    }
    void add(int x, int y){
        int c;
        c = x+y;
        System.out.println(c);
    }
    void add(int x , double y){
        double c;
        c = x + y;
        System.out.println(c);
    }
    public static void main(String[] args){
        methdoverload a = new methdoverload();
        
        int ret = a.add();
        System.out.println(ret);
        a.add(10,20);
        a.add(20, 30.20);

    }
}

