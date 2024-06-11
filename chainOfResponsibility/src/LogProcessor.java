public class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor){
        if(nextLogProcessor == null)
            System.out.println("1");
        else
            System.out.println("The next log processor is " + nextLogProcessor.toString());
        this.nextLogProcessor = nextLogProcessor;
    }

    public void Log(int logLevel, String msg){
        if(nextLogProcessor != null){
            System.out.println("next" + nextLogProcessor.toString());
            nextLogProcessor.Log(logLevel, msg);
        }
    }
}
