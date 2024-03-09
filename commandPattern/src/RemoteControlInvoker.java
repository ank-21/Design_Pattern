import java.util.Stack;

public class RemoteControlInvoker {
    ICommand iCommand;
    Stack<ICommand> commandStack = new Stack<>();

    public void setCommand(ICommand command){
        this.iCommand = command;
    }

    public void pressButton(){
        iCommand.execute();
        commandStack.push(iCommand);
    }

    public void undo(){
        if(!commandStack.isEmpty()){
            ICommand lastCommand = commandStack.pop();
            lastCommand.undo();
        }
    }
}
