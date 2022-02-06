package com.company;
class Customers{
    public String name;
    public String email;
    public int cell_no;
    public Customers(String name, String email, int cell_no){
        this.name = name;
        this.email = email;
        this.cell_no = cell_no;
    }
    public void print1(){
        System.out.println(name+ ' '+ email + ' ' + cell_no);
    }
}
class outlet{
    public String Display;
    public String product;
    public outlet(String D, String P){
        this.Display = D;
        this.product = P;
    }
    public void print3(){

    }
}
class Agora{
    public Customers per;
    public outlet u1;
    public Agora(Customers info){
        this.per = info;
    }
    public void print2(){
        per.print1();
    }
}
class Shop{
    public String email;
    public int cell_no;
    public Shop(String email, int cell_no){
        this.email = email;
        this.cell_no = cell_no;
    }
    public void print(){
        System.out.println(email+'\n'+ cell_no );
    }
}
public class Main {

    public static void main(String[] args) {
        Customers cus = new Customers("Nayon", "sdfgfg4546fdsa", 24345455);
        Shop s1 = new Shop("sdfgdfgf", 34545);
        Agora a1 = new Agora(cus);
        a1.print2();
    }
}
