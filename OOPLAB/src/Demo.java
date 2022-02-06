class ABC{
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}
 class demo extends ABC{
    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding method");
    }
}

public class Demo() {
    public static void main(String args[]) {
        demo obj1 = new ABC();
        ABC obj2 = new demo();

        Obj1.myMethod();
        Obj2.myMethod();
    }
}