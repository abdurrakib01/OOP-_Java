package com.company;
class Base{
    void demo (int a){
        System.out.println ("a: " + a);
    }
    void demo (int a, int b){
        System.out.println ("a and b: " + a + "," + b);
    }
    int demo(double a) {
        System.out.println("double a: " + --a);
        return (int) (a*a);
    }
}
public class Main{
    public static void main (String args []){
        Base Obj = new Base();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + ++result);
    }
}