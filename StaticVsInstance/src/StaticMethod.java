public class StaticMethod {
    public static void printSum(int a, int b){
        System.out.println(a+b);
    }
}

class MainHere{
    public static void main(String[] args) {
        StaticMethod.printSum(1,2);
        printHello(); // Dont need class name as we are calling from same class where declared
    }
    public static void printHello(){
        System.out.println("Hello !!");
    }

}
