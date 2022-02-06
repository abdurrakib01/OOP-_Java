package com.company;

class shape{
    protected int location;
    public shape(int l){
        this.location = l;
    }
    public void display(){
        System.out.println("display:" + location);
    }
}
class rectangle extends shape{
    private int height;
    private int width;
    public rectangle(int location, int h, int w){
        super(location);
        this.height = h;
        this.width = w;
    }
    public void display(){
        super.display();
        System.out.println("height = " + height +"\n"+ "width = "+ width);
    }
}
public class Main{
    public static void main(String[] args){
        rectangle r1 = new rectangle(2563, 56, 32);
        r1.display();
    }
}