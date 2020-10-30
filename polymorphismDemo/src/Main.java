import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	BaseLogger [] loggers = new BaseLogger[]{new EmailLogger() ,new DatabaseLogger() ,new FileLogger(),new ConsoleLogger()};
	for (BaseLogger logger : loggers){
        logger.log("Log Mesajı");
    }
	CustomerManager customerManager = new CustomerManager(new FileLogger());
	customerManager.add();
    }
}
