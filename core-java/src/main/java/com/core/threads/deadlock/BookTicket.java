package com.core.threads.deadlock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * thread designed to acquire two monitors
 *
 * @author Srinath.Rayabarapu
 */
public class BookTicket extends Thread {

	private static final Logger LOG = LoggerFactory.getLogger(BookTicket.class);

	private final Object train;
	private final Object comp;

	public BookTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}

	@Override
	public void run() {
		// grab lock on train
		synchronized (train) {
			LOG.info("grabbed lock on train monitor");
			try {
				train.wait(2000); //mimicking some operation
			} catch (Exception ignored) {
			}
			LOG.info("now trying to grab lock on comp monitor");
			synchronized (comp) {
				LOG.info("grabbed lock on comp monitor");
			}
		}
	}
}
