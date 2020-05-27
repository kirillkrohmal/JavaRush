package lesson15.big01.command;

import java.util.Collection;
import java.util.ResourceBundle;

class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "info_en");

    @Override
    public void execute() {
        ConsoleHelper.writeMessage(res.getString("before"));
        Collection<CurrencyManipulator> manipulators = CurrencyManipulatorFactory.getAllCurrencyManipulators();
        if (manipulators.isEmpty()) {
            ConsoleHelper.writeMessage(res.getString("no.money"));
        }
        else {
            int count = 0;
            for (CurrencyManipulator manipulator : manipulators) {
                if (manipulator.hasMoney() && manipulator.getTotalAmount() > 0) {
                    ConsoleHelper.writeMessage(manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount());
                    count++;
                }
            }
            if (count == 0) {
                ConsoleHelper.writeMessage("no.money");
            }
        }
    }
}
