package lesson15.big01.command;

import exception.InterruptOperationException;
import lesson15.big01.exception.InterruptOperationException;

interface Command {
    void execute() throws InterruptOperationException, InterruptOperationException;
}
