package SmartKitchen_HAS_AN;

public class SmartKitchen {
private CoffeeMaker brewMaster;
private Refrigerator iceBox;
private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    
    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeflag,boolean fridgeflag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeflag);
        iceBox.setHasWorkToDo((fridgeflag));
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}

class CoffeeMaker {
    boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            this.hasWorkToDo = false;
        }
    }
}



class Refrigerator {
    boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Food is been prepared");
            this.hasWorkToDo = false;
        }
    }
}
class DishWasher {
    boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishes is been made");
            this.hasWorkToDo = false;
        }
    }
}
