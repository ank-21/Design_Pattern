package observerPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import observerPattern.Observer.NotificationAlertObserver;

public class IphoneStocksObservableImpl implements StocksObservable {

    //This observersList will contain observers of all the concrete class of Notification interfaces and for any other observable concrete class we will have another observerslist
    public List<NotificationAlertObserver> observersList = new ArrayList<>();
    int stockCount = 0;
    
    @Override
    public void add(NotificationAlertObserver observer){
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    @Override
    public void updateStockCount(int newStockCount) {
        if(stockCount == 0){
            stockCount = stockCount + newStockCount;
            notifySubscribers();
        }
    }

    @Override
    public int getData() {
        return stockCount;
    }

    //setting stocks count equal to a number
    @Override
    public void setData(int currStockCount) {
        stockCount = currStockCount;
    }
}
