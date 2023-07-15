package Polymorphism;

public class Movie {
    private String type;

    public Movie(String type) {
        this.type = type;
    }

    public void movieDetails(){
        String instanceType = this.getClass().getTypeName();
        System.out.println("I am an "+instanceType +" movie");
    }

    public static Movie getType(String type,String title){
    return switch(type.toUpperCase().charAt(0)){
        case 'A'->new Adventure(title);
        case 'C'->new Comedy(title);
        case 'S'->new ScienceFiction(title);
        default -> new Movie(title);
        };
    }
}
class Adventure extends Movie{
    public Adventure(String type) {
        super(type);
    }

    @Override
    public void movieDetails() {
        super.movieDetails();
        System.out.println("I am an adventure movie");
        System.out.println("..".repeat(8));
        System.out.println("Lost in an island");
        System.out.println("Learn to survive");
        System.out.println("Come back home");
    }
}
class ScienceFiction extends Movie{
    public ScienceFiction(String type) {
        super(type);
    }

    @Override
    public void movieDetails() {
        super.movieDetails();
        System.out.println("I am an ScienceFiction movie");
        System.out.println("..".repeat(8));
        System.out.println("Attacked by aliens");
        System.out.println("Shoo the aliens");
        System.out.println("Come back to ");
    }
}
class Comedy extends Movie{
    public Comedy(String type) {
        super(type);
    }

    @Override
    public void movieDetails() {
        super.movieDetails();
        System.out.println("I am an Comedy movie");
        System.out.println("..".repeat(8));
        System.out.println("Dress as an female");
        System.out.println("stay with your daughter");
        System.out.println("Unite the family");
    }
}