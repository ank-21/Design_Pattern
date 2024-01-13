# Decorator Pattern Project

This project demonstrates the use of the Decorator Pattern in Java. A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically". The Decorator Pattern is also known as Wrapper.

## Project Structure

The project is organized as follows:

decoratorPattern/<br>
|-- Client.java [Main Class]<br>
|-- BasePizza.java [Abstract Class]<br>
|-- Farmhouse.java<br>
|-- Margherita.java<br>
|-- VegDelight.java<br>
|-- Decorator/<br>
| |--ExtraCheese.java<br>
| |--Mushroom.java<br>
| |--Paneer.java<br>
| |--ToppingsDecorator.java [abstract class]<br>

## Link for notes
https://www.notion.so/Decorator-Design-Pattern-630775572a1741b796cb3b1b84afc6e7

## Compilation and Execution

To compile and run the project, navigate to the `Design_Pattern` directory in the terminal and use the following commands:

```bash
javac decoratorPattern/Client.java
java decoratorPattern.Client
