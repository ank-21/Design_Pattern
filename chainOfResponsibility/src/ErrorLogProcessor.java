public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void Log(int logLevel, String msg) {
        if(logLevel == ERROR){
            System.out.println("ERROR: " + msg);
        }else{
            System.out.println("checkpoint 3");
            super.Log(logLevel, msg);
        }
    }
}
