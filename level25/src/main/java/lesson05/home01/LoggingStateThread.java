package lesson05.home01;

/**
 * Created by IGOR on 28.11.2015.
 */
public class LoggingStateThread extends Thread {
    Thread target;
    public LoggingStateThread(Thread target) {
        setDaemon(true);
        this.target = target;
    }

    @Override
    public void run() {
        State state = target.getState();
        System.out.println(state);
        while (state != State.TERMINATED) {
            state = target.getState();
            System.out.println(state);
        }
    }
}
