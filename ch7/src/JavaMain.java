
public class JavaMain {
    public static void main(String[] args) {
        Person person = new Person("John", "Smith");
        person.getFirstName();
        person.getLastName();

        // firstName is now a nullable type
        String firstName = person.getFirstName();
        if (firstName != null) { // condition is always true
            // handle non-null value
        }

        Person person2 = new Person();
//        person2.foo(); // doesn't compile

        String id = Foo.getID();

        HelpersKt.printGreeting("Nate");
        HelpersKt.log("message to log");

        System.out.println(ConstantsKt.KEY_ID);

        int result = AuthScreen.RESULT_AUTHENTICATED;
        AuthScreen authScreen = AuthScreen.Companion.create();
    }
}
