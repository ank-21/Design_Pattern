# Observer Pattern Project
The Observer pattern is a behavioral design pattern where an object, known as the subject, maintains a list of dependents, known as observers, that are notified of any state changes. This pattern is widely used in implementing distributed event handling systems. In Java, the Observer pattern is implemented using the Observer and Observable interfaces.



## Project Structure

The project is organized as follows:
Observer_Pattern/<br>
|-- Observable<br>
| |-- IphoneStocksObservableImpl.java<br>
| |-- StocksObservable.java [Interface]<br>
|-- Observer/<br>
| |-- EmailAlertObserverImpl.java<br>
| |-- NotificationAlertObserver.java [Interface]<br>
| |-- SmsAlertObserverImpl.java<br>
|-- Store.java

## Link for notes
https://www.notion.so/Observer-Design-Pattern-34d8a35950224525987853ea9dfa311b


## Compilation and Execution

To compile and run the project, navigate to the `Design_Pattern` directory in the terminal and use the following commands:

```bash
javac Observer_Pattern/Store.java
java Observer_Pattern.Store
