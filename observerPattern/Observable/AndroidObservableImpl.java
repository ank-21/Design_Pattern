package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservableImpl implements StocksObservable{
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
