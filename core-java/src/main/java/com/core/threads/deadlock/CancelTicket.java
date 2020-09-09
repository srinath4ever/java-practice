package com.core.threads.deadlock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * thread designed to acquire two monitors
 *
 * @author Srinath.Rayabarapu
 */
public class CancelTicket extends Thread {

	private static final Logger LOG = LoggerFactory.getLogger(CancelTicket.class);

	private final Object train;
	private final Object comp; //lock objects should be final in order to avoid any misuses

	public CancelTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}

	@Override
	public void run() {
		// grab lock on comp
		synchronized (comp) {
			LOG.info("grabbed lock on comp monitor");
			try {
				comp.wait(2000); //mimicking some operation
			} catch (Exception ignored) {
			}

			// assume that we are now getting data from server, if cancel ticket is performed very quickly we may
			// not face deadlock, try removing sleep and see.
			// This is why we say thread programs are difficult to debug .In many cases due to problems with threads
			// whole system hangs.
			LOG.info("now trying to grab lock on train monitor");
			synchronized (train) {
				LOG.info("grabbed lock on train");
			}
		}
	}
}
