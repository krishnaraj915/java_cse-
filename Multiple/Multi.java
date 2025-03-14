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
class Third extends Child {
    void helper(){
        display();
    }
}
public class Multi{
    public static void main(String args[]){
    Third obj = new Third();
    obj.helper();
}
}
