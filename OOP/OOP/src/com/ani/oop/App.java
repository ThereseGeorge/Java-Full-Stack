public interface Animal{
    public void move(){

    }

}
public interface Mammal{
    public void walk(){
        
    }

}
Public class Dog implements Animal, Mammal{
    public void move(){
        System.out.println("Dog inherits Animal");
       

    }
    public void walk(){
        System.out.println("Dog inherits Mammal");

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dog dg=new Dog();
        dg.move();
        dg.walk();
    }
}
