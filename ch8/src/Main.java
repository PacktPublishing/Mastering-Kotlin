import java.util.ArrayList;
import java.util.Arrays;

// Main.java
public class Main {
    public static void main(String[] args) {
        GreetingsHelper.sayHello("Nate");
        Constants.getScreenCount();

        Student student = new Student(
                "John",
                "Smith",
                11,
                Arrays.asList("Home Room", "Math", "Science", "Music")
        );

        Student defaultStudent = new Student();

        Widget.Companion.getFoo();
        Widget.getFoo();
        Widget.Companion.goo();
        Widget.Factory.create();
    }
}
