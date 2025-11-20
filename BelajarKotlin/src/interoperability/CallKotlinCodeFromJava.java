package interoperability;

public class CallKotlinCodeFromJava {
    public static void main(String[] args) {
        System.out.println("Hello from java");

        //TYPE_DATA NAMA_VARIABLE = NEW_NAMA_CLASS
        CounterExampleKotlin counter1 = new CounterExampleKotlin();

        System.out.println(counter1.getNumber());
        counter1.increment();
        System.out.println(counter1.getNumber());

        //TOP LEVEL FUNCTION
        System.out.println(StringUtilsKt.isEmail("test@gmail.com"));

        Logger logger = new Logger();
        logger.log("Aplikasi dimulai");
        logger.log("Aplikasi dimulai", "DEBUG");

        String dbUrl1 = Database.Companion.getConnectionUrl();
        String dbUrl2 = Database.getConnectionUrl();
        System.out.println(dbUrl1);
    }
}
