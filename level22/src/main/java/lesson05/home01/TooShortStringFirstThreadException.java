package lesson05.home01;

public class TooShortStringFirstThreadException extends RuntimeException {
    @Override
    public synchronized Throwable getCause()
    {
        return new StringIndexOutOfBoundsException();
    }
}
