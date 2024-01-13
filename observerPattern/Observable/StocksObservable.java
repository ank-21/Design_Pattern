package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void updateStockCount(int newStockCount);

    public int getData();

    public void setData(int currStockCount);
}
