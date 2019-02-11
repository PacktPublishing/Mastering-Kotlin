package kotlinfromjava;

public class KotlinFromJava {
    public static void main(String[] args) {
        Developer developer = new Developer("Your Name", "Kotlin");
        String name = developer.getName();

        LoggerKt.logMessage(name);
    }
}
