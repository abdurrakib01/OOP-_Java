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
        System.out.println(name+ '\n'+ email + '\n' + cell_no);
    }
}
class Display{

}
class product{

}
class outlet{
    public Display d_info;
    public product p_info;
    public outlet(Display d_info, product p_info){
        this.d_info = d_info;
        this.p_info = p_info;
    }
    public void print3(){

    }
}
class Agora{
    public Customers info;
    public outlet info2;
    public Agora(Customers info){
        this.info = info;
    }
    public void print2(){
        info.print1();
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
	Customers c1 = new Customers("Abdur", "rakib15-13656@diu.edu.bd", 59728416);
	Shop s1 = new Shop("abdurrakib427@gmail.com", 34563566);
	Agora a1 = new Agora(c1);
	a1.print2();
    }
}
