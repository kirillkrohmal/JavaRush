package lesson08.home05;


public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;


    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Computer() {

    }

    public CompItem getKeyboard() {
        return keyboard;
    }

    public CompItem getMonitor() {
        return monitor;
    }

    public CompItem getMouse() {
        return mouse;
    }
}
