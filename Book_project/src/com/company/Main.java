package com.company;
class book{
    public String name;
    public int pages;
    public book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }
    public void print1(){
        System.out.println(name + '\n' + pages);
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
    public void print2(){
        System.out.println(color + '\n' + model);
    }
}
class table{
    public int height;
    public int length;
    public int width;
    public book book_info;
    public pen pen_info;
    public table(int height, int length, int width, book book_info, pen pen_info){
        this.height = height;
        this.length = length;
        this.width = width;
        this.book_info = book_info;
        this.pen_info = pen_info;
    }
    public void print(){
        System.out.println(height+" "+length+" "+width);
        book_info.print1();
        pen_info.print2();
    }
}
public class Main {

    public static void main(String[] args) {
        book b1 = new book("Cp_book", 356);
        pen p1 = new pen("black", "Parker");
        table t1 = new table(23, 33, 62, b1, p1);
        t1.print();
    }
}
