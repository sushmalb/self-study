package InheritenceChallenge1;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    public int getAge(){
        int  currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }

}
