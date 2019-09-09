package javaexamples;

public class Singleton {
    public static void main(String[] args) throws InterruptedException {
        String language = "";
        if (args.length > 0) {
            language = args[0];
        }
        String finalLanguage = language;

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
                if (finalLanguage.equals("Kotlin")) {
                    SimpleSingleton singleton = SimpleSingleton.getInstance();
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                super.run();
                if (finalLanguage.equals("Kotlin")) {
                    SimpleSingleton singleton = SimpleSingleton.getInstance();
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
