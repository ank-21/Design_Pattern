# Factory Pattern Project

This project demonstrates the use of the Factory Pattern in Java. A Factory Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which similar class to instantiate on condition basis.

## Project Structure

The project is organized as follows:

factoryPattern/<br>
|-- Client.java [Main Class]<br>
|-- Subscription.java [Parent Class]<br>
|-- AnnualSubscription.java<br>
|-- HalfYearlySubscription.java<br>
|-- MonthlySubscription.java<br>
|-- SubscriptionFactory.java<br>

## Link for notes
https://www.notion.so/Factory-Design-Pattern-b8f77807bb884b809a1497df432420ec

## Compilation and Execution

To compile and run the project, navigate to the `Design_Pattern` directory in the terminal and use the following commands:

```bash
javac factoryPattern/Client.java
java factoryPattern.Client
