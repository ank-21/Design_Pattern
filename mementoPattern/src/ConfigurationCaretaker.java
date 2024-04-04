import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            ConfigurationMemento lastMemento = history.getLast();
            history.removeLast();
            return lastMemento;
        }
        return null;
    }
}
