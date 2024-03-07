public class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void Log(int logLevel, String msg){
        if(nextLogProcessor != null){
            nextLogProcessor.Log(logLevel, msg);
        }
    }
}
