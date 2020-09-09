package com.core.threads;

/**
 * The ThreadLocal class in Java enables you to create variables that can only be read and written by the same
 * thread. Thus, even if two threads are executing the same code, and the code has a reference to a ThreadLocal
 * variable, then the two threads cannot see each other's ThreadLocal variables.
 * <p>
 * https://www.youtube.com/watch?v=sjMe9aecW_A&t=22s
 * http://tutorials.jenkov.com/java-concurrency/threadlocal.html
 *
 * @author Srinath.Rayabarapu
 */
public class ThreadLocalMain {

    public static void main(String[] args) throws Exception {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    static class MyRunnable implements Runnable {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {
            threadLocal.set((int) (Math.random() * 100D)); //each thread will set value separately
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        }
    }

}