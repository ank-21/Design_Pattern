
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        Colleague bidder1 = new Bidder(auctionMediator, "KKR");
        Colleague bidder2 = new Bidder(auctionMediator, "CSK");
        Colleague bidder3 = new Bidder(auctionMediator, "MI");

        bidder1.placeBid(120);
        bidder2.placeBid(150);
        bidder1.placeBid(220);
        bidder3.placeBid(240);
    }
}