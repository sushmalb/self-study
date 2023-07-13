package HASAN;

public class Engine {
    public void startEngine(){
        System.out.println("Engine started");
    }
}

class Car{
    Engine engine;

    public Car() {
        this.engine =new Engine();
    }

    public void startCar(){
        engine.startEngine();
        System.out.println("Car started");
    }
}
class main{
    public static void main(String[] args) {
Car car  =  new Car();
car.startCar();
    }
}
