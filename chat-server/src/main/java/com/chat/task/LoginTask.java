package com.chat.task;

import org.apache.mina.core.session.IoSession;

public class LoginTask extends Task {

	public LoginTask(IoSession session, Object message) {
		super(session, message);
		
	}

	@Override
	public void messageReceived(Object message) {
		System.out.println("登录验证");
	}

	@Override
	public void messageSent(Object message) {
	    System.out.println("客户端接收成功");
		
	}
	
	
	
	
	
	
	
	

}
