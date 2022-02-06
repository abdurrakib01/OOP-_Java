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
    public cleanbean();
}
class rice_cooking extends Cooking implements Eating, Gasovan, Clean{
    private String rice_type;
    public rice_cooking(double quantity, String rice_type){
        super(quantity);
        this.rice_type = rice_type;
    }
    public void Eating(){
        System.out.println("Eat");
    }
    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void clean(){
        System.out.println("Clean");
    }
    public void display(){
        super display();
        System.out.println(rice_type);
    }
}
public class Main {
    public static void main(String[] args) {
	rice_cooking r1 = new rice_cooking(100, "bashmoti");
	r1.display();
	r1.eat();
	r1.start();
	r1.stop();
	r1.clean();
    }
}
