package com.chat.task;

import org.apache.mina.core.session.IoSession;

public abstract class Task {
	
	private Object message;
	private IoSession session;
	public Task(Object message) {
	  this.message = message;
	}
	public Task(IoSession session, Object message) {
			this(message);
			this.session=session;
	}
	
	
	abstract public void messageReceived(Object message);
	
	abstract public void messageSent(Object message);
	
	
	

}
