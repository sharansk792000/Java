/*simple inheritance contains only one super class as well as one sub class */
public class simpleinheritance {
    int rollnum;
    int marks;
     String name;
    void input(){
        System.out.println("enter roll number, name and marks");
    }
}
//subclass
class Sharan extends simpleinheritance{ 
    void diplay(){
        rollnum = 1;
        marks = 50;
        name = "sharan";
        System.out.println(rollnum+" "+marks+" "+name);
    }
    public static void main(String[] args){
        Sharan ref = new Sharan();
        ref.input();
        ref.diplay(); 
    }
}

