public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void Log(int logLevel, String msg) {
        if(logLevel == ERROR){
            System.out.println("ERROR: " + msg);
        }else{
            super.Log(logLevel, msg);
        }
    }
}
