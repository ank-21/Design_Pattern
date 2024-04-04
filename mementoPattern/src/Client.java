public class Client {

    public static void main(String[] args){
        ConfigurationCaretaker caretaker = new ConfigurationCaretaker();

        //initiate state of originator
        ConfigurationOriginator originator = new ConfigurationOriginator();
        originator.setHeight(5);
        originator.setWidth(10);

        //save it
        ConfigurationMemento snapshot1 = originator.createMemento();

        //add it to history
        caretaker.addMemento(snapshot1);

        //originator changes its state
        originator.setWidth(7);
        originator.setHeight(10);

        //save it
        ConfigurationMemento snapshot2 = originator.createMemento();

        //add it to history
        caretaker.addMemento(snapshot2);

        //originator changes its state
        originator.setWidth(15);
        originator.setHeight(20);

        //undo it
        ConfigurationMemento lastMemento = caretaker.undo();
        originator.restoreMemento(lastMemento);

        System.out.println("Height : " + originator.getHeight() + " Width : " + originator.getWidth());


    }



}
