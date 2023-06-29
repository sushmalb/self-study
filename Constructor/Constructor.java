public class Constructor {
    private String firstName;
    private String lastName;
    private int age;

    public Constructor(){
        this("John","Walter",20);
        System.out.println("I am the default constructor");
    }

    public Constructor(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main(){
    public static void main(String[] args) {
        Constructor con = new Constructor();
    }
}
