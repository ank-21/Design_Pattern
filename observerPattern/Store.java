package observerPattern;

import observerPattern.Observable.IphoneStocksObservableImpl;
import observerPattern.Observable.StocksObservable;
import observerPattern.Observer.EmailAlertObserverImpl;
import observerPattern.Observer.NotificationAlertObserver;
import observerPattern.Observer.SmsAlertObserverImpl;


public class Store {
    
    public static void main(String args[]){

        StocksObservable iPhoneObservable = new IphoneStocksObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iPhoneObservable, "ankit@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iPhoneObservable, "ank21@gmail.com");
        NotificationAlertObserver observer3 = new SmsAlertObserverImpl(iPhoneObservable, "9123421208");

        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);
        iPhoneObservable.add(observer3);

        //Adding 10 new stocks to the current stocks
        iPhoneObservable.updateStockCount(10);

        //Setting the current stock Value to 0
        iPhoneObservable.setData(0);

        //Again updating new stock to the current stocks count
        iPhoneObservable.updateStockCount(4);

        //This will give the current stock size
        int currStock = iPhoneObservable.getData();
        System.out.println("Current stock is " + currStock);

    }
}
