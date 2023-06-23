package lesson06.home01;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    public static AtomicInteger atomicInteger = new AtomicInteger(1);


    public MyThread(Runnable target, String name) {
        super(target, name);
        if (atomicInteger.get() < 10) {
            setPriority(atomicInteger.incrementAndGet());
        } else {
            setPriority(atomicInteger.get());
            atomicInteger.set(1);
        }
    }

    public MyThread(Runnable target) {
        super(target);
        if (atomicInteger.get() < 10) {
            setPriority(atomicInteger.incrementAndGet());
        } else {
            setPriority(atomicInteger.get());
            atomicInteger.set(1);
        }
    }

    public MyThread(String name) {
        super(name);
        if (atomicInteger.get() < 10) {
            setPriority(atomicInteger.incrementAndGet());
        } else {
            setPriority(atomicInteger.get());
            atomicInteger.set(1);
        }
    }

    public MyThread(ThreadGroup threadGroup, Runnable target, String name, long stackSize) {
        super(threadGroup, target, name, stackSize);
        int max = threadGroup.getMaxPriority();
        int temp = 0;
        if (atomicInteger.get() < 10) {
            temp = atomicInteger.get();
            temp = atomicInteger.getAndIncrement();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
        } else {
            temp = atomicInteger.get();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
            atomicInteger.set(1);
        }
    }

    public MyThread(ThreadGroup threadGroup, Runnable target, String name) {
        super(threadGroup, target, name);
        int max = threadGroup.getMaxPriority();
        int temp = 0;
        if (atomicInteger.get() < 10) {
            temp = atomicInteger.get();
            temp = atomicInteger.getAndIncrement();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
        } else {
            temp = atomicInteger.get();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
            atomicInteger.set(1);
        }
    }

    public MyThread(ThreadGroup threadGroup, Runnable target) {
        super(threadGroup, target);
        int max = threadGroup.getMaxPriority();
        int temp = 0;
        if (atomicInteger.get() < 10) {
            temp = atomicInteger.get();
            temp = atomicInteger.getAndIncrement();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
        } else {
            temp = atomicInteger.get();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
            atomicInteger.set(1);
        }
    }

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
        int max = threadGroup.getMaxPriority();
        int temp = 0;
        if (atomicInteger.get() < 10) {
            temp = atomicInteger.get();
            temp = atomicInteger.getAndIncrement();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
        } else {
            temp = atomicInteger.get();
            if (temp > max) {
                setPriority(max);
            } else setPriority(temp);
            atomicInteger.set(1);
        }
    }

    public MyThread() {
        if (atomicInteger.get() < 10) {
            setPriority(atomicInteger.incrementAndGet());
        } else {
            setPriority(atomicInteger.get());
            atomicInteger.set(1);
        }
    }


}
