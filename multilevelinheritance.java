/*This contains one super class and contains multiple subclass where previous subclass will be made as superclass */

import java.util.Scanner;

class multilevelinheritance {
    int x;
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values for a and b");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}
class add extends multilevelinheritance{
    void addblock(){
        x = a+b;
        System.out.println("addition: "+x);
        

    }
    void divide(){
        x = a/b;
        System.out.println("division: "+ x);

    }
    

}
class display extends add{
    void sub(){
        x = b-a;
        System.out.println("substraction: "+x);

    }
    void mod(){
        x = a%b;
        System.out.println("modulus/remainder: "+x);

    }
   
}
class test{
    public static void main(String[] args){
        display d = new display();
        d.input();
        d.addblock();
        d.sub();
        d.mod();
        d.divide();
    }

    }

