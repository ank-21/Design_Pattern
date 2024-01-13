package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    //This reference is important, which we are having through constrcutor injection.
    StocksObservable stObservable;
    //From stObservable object we will get the idea of which concrete classes of StocksObservable it is. (Currently only one - iPhoneObservableImpl)
    String emailId;

    //constructor
    public EmailAlertObserverImpl(StocksObservable stObservable, String emailId){

       this.stObservable = stObservable;
       this.emailId = emailId;
    }
    
    @Override
    public void update(){
        sendMail(emailId, "Product is in stock, hurry up! " + stObservable.getData() + " items left now");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to " + emailId + " as " + msg);
    }
}
