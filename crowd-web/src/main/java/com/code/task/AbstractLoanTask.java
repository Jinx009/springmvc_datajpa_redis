package com.code.task;

import org.apache.log4j.Logger;

public class AbstractLoanTask implements LoanTask{
	private Logger logger = Logger.getLogger(AbstractLoanTask.class);
	
	public Thread task = new Thread("task"){
		private boolean isRun = true;
		public void run(){
			while (isRun){
				logger.debug(this.getName()+" running...");
				doLoan();
				doWait();
			}
		}
		@SuppressWarnings("unused")
		public void stopThread(){
			isRun = false;
		}
	};

	public AbstractLoanTask(){
		task.start();
	}

	public void execute(){
		Object lock = getLock();
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	public void doLoan(){
	}

	public void doWait(){
		Object lock = this.getLock();
		synchronized (getLock()) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stop(){
	}

	public Object getLock(){
		return LoanTask.LOAN_STATUS;
	}
}
