package SmartKitchen_HAS_AN;

public class Main {
    public static void main(String[] args) {
        SmartKitchen sk = new SmartKitchen();
//        sk.getBrewMaster().setHasWorkToDo(true);
//        sk.getDishWasher().setHasWorkToDo(false);
//        sk.getIceBox().setHasWorkToDo(true);
//
//        sk.getDishWasher().doDishes();
//        sk.getIceBox().orderFood();
//        sk.getBrewMaster().brewCoffee();

sk.setKitchenState(true, true,false);
sk.doKitchenWork();
    }
}
