package decoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import decoratorPattern.Decorator.ExtraCheese;
import decoratorPattern.Decorator.Mushroom;
import decoratorPattern.Decorator.Paneer;

public class Client {

    private static int choice, toppingsChoice;
    private static BasePizza pizza;
    public static void main(String[] args) throws NumberFormatException, IOException  {
        displayMenu(); 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  

        if (choice >= 1 && choice <= 3){
            pizza = createPizza(choice);

            displayToppingsMenu();
            toppingsChoice = Integer.parseInt(br.readLine());

            switch (toppingsChoice) {
                case 1:
                    addExtraCheese();
                    break;
                case 2:
                    addPaneer();
                    break;
                case 3:
                    addMushroom();
                    break;
                default:
                    System.out.println("Invalid toppings choice.");
            }

            // Now, pizza object is ready with chosen toppings, you can perform further actions.
            System.out.println("The cost of your pizza is " + pizza.cost());
        } else if (choice == 4) {
            System.out.println("Thanks for visiting!");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void displayMenu() {
        //add new line in single SOPln
        System.out.println("========= Pizza Menu ============");
        System.out.println("1. Farmhouse Pizza.");
        System.out.println("2. Margherita Pizza.");
        System.out.println("3. Veggie Delight Pizza.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayToppingsMenu() {
        System.out.println("========= Choose Single Topping ============");
        System.out.println("1. Extra Cheese");
        System.out.println("2. Paneer");
        System.out.println("3. Mushroom");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        //add a list for iterating different choices
    }

    private static BasePizza createPizza(int pizzaBaseChoice){

        switch (pizzaBaseChoice) {
            case 1:
                return new Farmhouse();

            case 2:
                return new Margherita();

            case 3:
                return new VegDelight();

            default:
                throw new IllegalArgumentException("Invalid pizza choice.");
        }
    }

    //for multiple toppings we will create an array and then push the elements
    private static void addExtraCheese(){
        pizza = new ExtraCheese(pizza);
    }

    private static void addPaneer(){
        pizza = new Paneer(pizza);
    }

    private static void addMushroom(){
        pizza = new Mushroom(pizza);
    }
}
