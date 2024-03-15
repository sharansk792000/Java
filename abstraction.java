/*Abstraction is a process of hiding implementation from the user and only
 the highlighted set of services provided to the user is visible
 in abstraction it is implemented by using abstract class
 */
abstract class abstraction {
    public abstract void sound();
    abstraction(){
        System.out.println("Animals are nice");
    }
    
}
class dog extends abstraction{
    dog(){
        super();
    }
    public void sound(){
        
        System.out.println("dog barks");
    }
}
class lion extends abstraction{
    lion(){
        super();
    }
    public void sound(){
        System.out.println("Lion roars");
    }
    

}
class show{
    public static void main(String[] args){
        dog d = new dog();
        lion r = new lion();
        d.sound();
        r.sound();
    }
}
