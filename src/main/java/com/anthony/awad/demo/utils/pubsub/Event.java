package com.anthony.awad.demo.utils.pubsub;

public class Event {
	private final IJob job;
	private final JobType jobType;
	public Event(IJob job,JobType jobType) {
		super();
		this.job = job;
		this.jobType = jobType;
	}
	
	public IJob getJob() {
		return job;
	}
	public JobType getJobType() {
		return jobType;
	}
	
	
}
