package com.anthony.awad.demo.utils.pubsub;


public  class Publisher {
	private Event event;

	public Publisher(Event event) {
		this.event = event;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	
}
