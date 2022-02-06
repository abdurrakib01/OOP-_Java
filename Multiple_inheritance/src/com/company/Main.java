package com.company;
abstract class Cooking{
    protected double quantity;
    public Cooking(double quantity){
        this.quantity = quantity;
    }
    public void display(){
        System.out.println(quantity);
    }
}
interface Eating{
    public void eat();
}
interface Gasovan{
    public void start();
    public void stop();
}
interface Clean{
    public void cleanbean();
}
class rice_cooking extends Cooking implements Eating, Gasovan, Clean{
    private String type;
    public rice_cooking(double quantity, String rice_type){
        super(quantity);
        this.type = rice_type;
    }
    public void eat(){
        System.out.println("eating");
    }
    public void start(){
        System.out.println("start");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void cleanbean(){
        System.out.println("clean");
    }

    public void display(){
        super.display();
        System.out.println(type);
    }
}
public class Main {
    public static void main(String[] args) {
        rice_cooking r1 = new rice_cooking(100, "bashmoti");
        r1.display();
        r1.eat();
        r1.start();
        r1.stop();
        r1.cleanbean();
    }
}
