public record StudentRecord(String id, String name, String dob, String classList) {

}
class MainRecord {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            StudentRecord s = new StudentRecord("s92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Joe";
                        case 3 -> "Linda";
                        case 4 -> "Jen";
                        case 5 -> "Amy";
                        default -> "Anonymous";
                    }, "05/11/1998", "Java Masterclass");
            System.out.println(s);
            System.out.println(s.id());
        }

    }
}