public class Bidder implements Colleague{
    //It can only belong to one certain mediator
    AuctionMediator auctionMediator;
    String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        //add this bidder to bidders list in auction mediator
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder " + this.name + " has got the notification that someone has placed the bid of Rs " + bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
