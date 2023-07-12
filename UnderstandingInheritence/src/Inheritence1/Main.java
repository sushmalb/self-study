package Inheritence1;

public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic","medium",100);
    doAnimalStuff(animal,"slow");

    Dog dog =  new Dog();
    doAnimalStuff(dog,"fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);

    }
}
