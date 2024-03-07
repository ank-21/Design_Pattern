public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void Log(int logLevel, String msg) {
        if(logLevel == INFO){
            //work on it if it belongs to this class
            System.out.println("INFO: " + msg);
        }else{
            //Goes to LogProcessor in all cases of chaining
            super.Log(logLevel, msg);
        }
    }
}
