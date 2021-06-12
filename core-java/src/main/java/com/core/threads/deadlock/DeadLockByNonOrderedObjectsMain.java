package com.core.threads.deadlock;

/**
 * shows how a deadlock can be achieved by trying to acquire lock on two monitors:
 * <p>
 * CancelTicket first gets lock on comp monitor and then sleeps for 2 sec and tried to get lock on train monitor
 * BookTicket first gets lock on train monitor and then sleeps for 2 sec and tried to get lock on comp monitor
 * <p>
 * <i>Eventually both threads will be waiting for monitors and end up in a deadlock!</i>
 *
 * @author Srinath.Rayabarapu
 */
public class DeadLockByNonOrderedObjectsMain {

    public static void main(String[] args) {

        var train = new Object(); // this object should be assumed as train
        var compartment = new Object();// this has to be assumed as a compartment

        Thread t1 = new CancelTicket(train, compartment);
        Thread t2 = new BookTicket(train, compartment);

        // we are now spinning off two threads one for booking a ticket and other for cancelling ticket
        t1.start();
        t2.start();
    }
}