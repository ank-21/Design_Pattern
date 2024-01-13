package factoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    
    public static void main(String[] args)throws IOException {
        SubscriptionFactory subscriptionFactoryObj = new SubscriptionFactory();

        System.out.println("Please choose your Subscription plan\n" +
                    "1. Annualy\n" +
                    "2. Half yearly\n" +
                    "3. Monthly;");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String subscriptionType = br.readLine();

        Subscription subscription = subscriptionFactoryObj.getSubscriptionPlan(subscriptionType);
        subscription.getCost();
        subscription.calculateBill();
    }
}
