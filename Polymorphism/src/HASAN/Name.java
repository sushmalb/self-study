package HASAN;

public class Name {
     String firstName;
     String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Student {
    int rollNo;
    public void display(int rollNo, Name n){
        System.out.println("Student Name:"+n.firstName+" "+n.lastName);
        System.out.println("Student rollNo:"+rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        Name name = new Name("Sushma","B");
        s.display(50,name);
    }
}
