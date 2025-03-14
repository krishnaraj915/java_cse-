public class Strings{
public String Concatenator(String name,String name1){
    String name2=name+" "+name1;
    return name2;
}
public static void main(String args[]){
    Strings obj=new Strings();
    String x=obj.Concatenator("krishna","priya");
    System.out.println(x);
}
}