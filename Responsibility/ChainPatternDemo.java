/**
 * ChainPatternDemo
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    };

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessages(AbstractLogger.INFO, "This is an Information.");
        loggerChain.logMessages(AbstractLogger.DEBUG, "This is a Debug.");
        loggerChain.logMessages(AbstractLogger.ERROR, "This is an Error.");

    };
}