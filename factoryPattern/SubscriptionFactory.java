package factoryPattern;

public class SubscriptionFactory {
    //this is source of truth, object will get initiated here

    Subscription getSubscriptionPlan(String input){
        switch (input) {
            case "Annual":
            case "1":
                return new AnnualSubscription();
            
            case "HalfYearly":
            case "2":
                return new HalfYearlySubscription();

            case "Monthly":
            case "3":
                return new MonthlySubscription();
            default:
                return null;
        }
    }
}
