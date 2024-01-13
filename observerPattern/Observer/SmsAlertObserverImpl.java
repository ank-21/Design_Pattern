package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class SmsAlertObserverImpl implements NotificationAlertObserver {

    String phoneNumber;
    StocksObservable stObservable;

    public SmsAlertObserverImpl(StocksObservable stObservable, String phoneNumber){
        this.stObservable = stObservable;   //here we will get idea of which concrete class it is of
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void update(){
        sendSms(phoneNumber, "Product is in stock, hurry up! " + stObservable.getData() + " items left now");
    }

    private void sendSms(String phoneNumber, String msg){
        System.out.println("SMS sent to " + phoneNumber +  " as " + msg);
    }
}
