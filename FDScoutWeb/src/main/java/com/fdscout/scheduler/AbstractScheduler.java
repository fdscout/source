package com.fdscout.scheduler;

import uk.ltd.getahead.dwr.util.Logger;

public abstract class AbstractScheduler {
	private String jobName;
	
	public final void execute() {
		Logger.getLogger(this.getClass()).warn("*****************************************************");
		Logger.getLogger(this.getClass()).warn("Start to run job : " + jobName);
		try {
			run();
		}
		catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.toString());
		}
		Logger.getLogger(this.getClass()).warn("Finish running job : " + jobName);
	}
	
	protected abstract void run();

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
