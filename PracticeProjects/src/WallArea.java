public class WallArea {
    private  double height;
    private double width;

    public WallArea(double height, double width) {
        this.height = (height<0) ? 0:height;
        this.width = (width<0)?0:width;
    }

    public double getHeight() {

            return height;

    }

    public void setHeight(double height) {
        if (height>=0) {
            this.height = height;
        }else{
            this.height = 0;
        }

    }

    public double getWidth() {

            return width;


    }

    public void setWidth(double width) {
        if(width>=0) {
            this.width = width;
        }else{
            this.width  = 0;
        }
    }

    @Override
    public String toString() {
        return "WallArea{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public double getArea(){
        return width*height;
    }


    public static void main(String[] args) {
        WallArea wall = new WallArea(5,4);
       System.out.println(wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

}
