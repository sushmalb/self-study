package Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer(10,5,true);
        System.out.println("Initial page printed:"+ p.getPagesPrinted());
        p.addToner(10);
        p.printPages(10);
    }
}
