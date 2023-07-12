package InheritenceChallenge1;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/11,1985",7700,"01/01/2020");
        System.out.println(tim);
        System.out.println("Age:"+ tim.getAge());

        Employee joe = new Employee("Joe","11/11,1985",7700,"01/01/2020");
        System.out.println(joe);
    }
}
