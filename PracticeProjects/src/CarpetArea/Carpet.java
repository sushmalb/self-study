package CarpetArea;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost < 0){
            this.cost = 0;
        }else {
            this.cost = cost;
        }

    }


}
