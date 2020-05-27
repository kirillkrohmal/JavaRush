package lesson15.big01.command;

import java.util.ResourceBundle;

class ExitCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "exit_en");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
        if (ConsoleHelper.readString().equals(res.getString("yes"))) {
            ConsoleHelper.writeMessage(res.getString("thank.message"));
            throw new InterruptOperationException();
        }
    }
}
