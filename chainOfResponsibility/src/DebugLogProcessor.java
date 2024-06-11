public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void Log(int logLevel, String msg) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + msg);
        }else{
            System.out.println("checkpoint 2");
            super.Log(logLevel, msg);
        }
    }
}
