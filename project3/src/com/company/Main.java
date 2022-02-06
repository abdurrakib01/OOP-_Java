package com.company;
class book{
    public String name;
    public int pages;
    public book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }
    public void display(){
        System.out.println(name + ' ' + pages);
    }
}
class stationary{

}
class pen{
    public String color;
    public String model;
    public pen(String color, String model){
        this.color = color;
        this.model = model;
    }
    public void display2(){
        System.out.println(color + ' ' + model);
    }
}
class table{
    public int height;
    public int length;
    public int width;
    public book info1;
    public pen info2;
    public table(int height, int length, int width, book info1, pen info2){
        this.height = height;
        this.length = length;
        this.width = width;
        this.info1 = info1;
        this.info2 = info2;
    }
    public void print(){
        System.out.println(height+" "+length+" "+width);
        info1.display();
        info2.display2();
    }
}
public class Main {

    public static void main(String[] args) {
        book bo = new book("Cp book", 356);
        pen pe = new pen("black", "Parker");
        table ta = new table(245, 334, 623, bo, pe);
        ta.print();
    }
}
