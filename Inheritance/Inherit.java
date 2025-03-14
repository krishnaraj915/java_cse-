class Parent{
public void add(){
    System.out.println("helo world");
}
}
class Child extends Parent{
    void display(){
        add();
    }
}
public class Inherit{
    public static void main(String args[]){
    Child obj = new Child();
    obj.display();
}
}
