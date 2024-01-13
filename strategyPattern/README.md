# Strategy Pattern Project

This project demonstrates the use of the Strategy Pattern in Java. The strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. The pattern lets the algorithm vary independently from clients that use it.

## Project Structure

The project is organized as follows:

Strategy_Pattern/<br>
|-- Client.java [Main Class]<br>
|-- Vehicle.java [Parent Class]<br>
|-- SportsVehicle.java<br>
|-- GoodsVehicle.java<br>
|-- Strategy/<br>
| |-- DriveStrategy.java [Interface]<br>
| |-- NormalDriveStrategy.java<br>
| |-- SportsDriveStrategy.java<br>

## Link for notes
https://www.notion.so/Strategy-Design-Pattern-fdb1ef2124114a9fa831bbf5f2cea53b


## Compilation and Execution

To compile and run the project, navigate to the `Design_Pattern` directory in the terminal and use the following commands:

```bash
javac Strategy_Pattern/Client.java
java Strategy_Pattern.Client
