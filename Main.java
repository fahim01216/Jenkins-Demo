import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Java Program");
        System.out.println("Output from Java Program");
        System.err.println(new Date());
        System.out.println("Added some files");

        Student student = new Student();
        student.sayHell();
    }
}