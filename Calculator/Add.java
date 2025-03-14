public class Add{
    public int add(int num1,int num2){
        int num3=num1+num2;
        return num3;
    }
    public static void main(String args[]){
    Add obj=new Add();
        int c=obj.add(20,30);
        System.out.println(c);
    }
}
