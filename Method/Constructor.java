public class Constructor{
    public void add(int numOne,int numTwo){
        int numThree = numOne+numTwo;
        System.out.println(numThree);
    }
    public static void main(String args[]){
        int numOne =10;
        System.out.println(numOne);
        Constructor obj=new Constructor();
        obj.add(10,20);
    }
}