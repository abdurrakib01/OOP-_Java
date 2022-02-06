package com.company;
class display{
    public String re;
    public display( String re){
        this.re = re;
    }
    public void print(){
        System.out.println(re);
    }
}
class powerpack{
    public double battary;
    public powerpack(double battary){
        this.battary = battary;
    }
    public void print(){
        System.out.println(battary);
    }
}
class cell_phone {
    private String model_no;
    private display d;
    private powerpack p;
    public cell_phone(String mn, display e, powerpack P){
        this.model_no = mn;
        this.d = e;
        this.p = P;
    }
    public void print(){
        System.out.println(model_no + '\n' + d.re + '\n' + p.battary);
    }
}

public class Main {
    public static void main(String[] args) {
        display d1 = new display("lcd panel");
        powerpack p1 = new powerpack(3.4);
        cell_phone c1 = new cell_phone("nokia123", d1,p1);
        c1.print();


    }
}

