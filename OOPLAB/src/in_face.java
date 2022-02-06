class vehicle{
    protected String model;
    public vehicle(String m){
        this.model = m;
    }
    public void display(){
        System.out.println("model: "+model);
    }
}
interface drive{
    public void start();
    public void stop();
}
interface power{
    public void set();
}
class car extends vehicle implements drive, power{
    private double price;
    public car(String model, double p){
        super(model);
        this.price = p;
    }
    public void start(){
        System.out.println("start");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void set(){
        System.out.println("set");
    }
    public void display(){
        super.display();
        System.out.println("Price = "+price);
    }
}
public class in_face {
    public static void main(String[] args){
        car c1 = new car("BMW", 12300000);
        c1.display();
        c1.start();
        c1.set();
        c1.stop();
    }
}