class Parent{
    void display(){
        System.out.println("hello");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("home");
    }
}
public class Over{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }

}
