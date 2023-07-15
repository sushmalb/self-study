package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s  = new Scanner(System.in);
        while(true){
            System.out.println("Enter type 'A' for adventure,'C' for Comedy and 'S' for science fiction and " +
                    "Q to exit");
            String type = s.nextLine();
            if("qQ".contains(type)){
                break;
            }
            System.out.println("Enter Movie name:");
            String name  = s.nextLine();
            Movie movie  = Movie.getType(type,name);
            movie.movieDetails();

        }

    }
}
