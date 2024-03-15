/*Heirarchcal inheritance basically here one super class extends multiple subclass
 where sub class is directly extended from super class
 */
import java.util.Scanner;
public class hierarchicalinheritance {
    int a;
    int b,c;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("insert a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
    }
}

class addblock extends hierarchicalinheritance{
    void add(){
        c = a+b;
        System.out.println("addition is: "+c);
    }
}
class substract extends hierarchicalinheritance{
    void subtract(){
        c = a-b;
        System.out.println("substraction: "+c);
    }
    public static void main(String[] args){
        addblock a = new addblock();
        substract s = new substract();
        a.input();
        a.add();
        s.input();
        s.subtract();
        }

}
