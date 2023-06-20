package lesson15.big01.kitchen;



import lesson15.big01.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waitor implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(arg + " was cooked by " + o);
    }
}
