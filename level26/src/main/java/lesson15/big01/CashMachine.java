package lesson15.big01;



import lesson15.big01.command.CommandExecutor;
import lesson15.big01.exception.InterruptOperationException;

import java.util.Locale;

public class CashMachine {
    public static final String RESOURCE_PATH = "com.javarush.test.level26.lesson15.big01.resources.";

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            CommandExecutor.execute(Operation.LOGIN);
            Operation currentOperation = null;
            do {
                currentOperation = ConsoleHelper.askOperation();
                CommandExecutor.execute(currentOperation);
            }
            while (currentOperation != Operation.EXIT);
        }
        catch (InterruptOperationException e) {
            ConsoleHelper.writeMessage("Goodbye!");
        }
    }
}
