package lesson15.big01.command;

import exception.InterruptOperationException;

interface Command {
    void execute() throws InterruptOperationException;
}
