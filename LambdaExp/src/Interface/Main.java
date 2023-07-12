package Interface;

import lombok.Data;
@Data

public class Main {
    public static void main(String[] args) {
//        Cat myCat = new Cat();
//        myCat.print();
        printThing((s)-> "Meow" + s);

    }
    static void printThing(Printable thing){
        thing.print("!");
    }

}
