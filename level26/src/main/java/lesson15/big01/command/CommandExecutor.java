package lesson15.big01.command;

import java.util.HashMap;
import java.util.Map;
import

public class CommandExecutor {
    public static Map<Operation, Command> map;

    private CommandExecutor() {}

    static {
        map = new HashMap<>();
        map.put(Operation.LOGIN, new LoginCommand());
        map.put(Operation.INFO, new InfoCommand());
        map.put(Operation.DEPOSIT, new DepositCommand());
        map.put(Operation.WITHDRAW, new WithdrawCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        map.get(operation).execute();
    }
}
