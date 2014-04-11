package com.chat.server;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.chat.task.LoginTask;
import com.chat.task.Task;


public class ChatServerHandler extends  IoHandlerAdapter{
	
	private static Logger logger = Logger.getLogger(ChatServerHandler.class);
	//ID 
	private Map<Integer,IoSession> onlineSessions = Collections.synchronizedMap(new HashMap<Integer, IoSession>());
	
	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		logger.info(session.getFilterChain().getSession().getRemoteAddress()+" sessionIdle");
	}

	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		
		logger.info("Client RemoteAddress Quit Server:"+session.getFilterChain().getSession().getRemoteAddress());
		
	}

	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		logger.info(session.getFilterChain().getSession().getRemoteAddress()+" say: "+message.toString());
		
		Task task = new LoginTask(session,message);
		task.messageReceived(message);
		
		
		
		broadcast(message.toString());
		
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		
		//验证权限,进行添加用户
		session.setAttribute("id", 297007253);
		onlineSessions.put(297007253, session);
		logger.info(session.getFilterChain().getSession().getRemoteAddress()+" sessionCreated");
	}
	
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		
		logger.info(session.getFilterChain().getSession().getRemoteAddress()+" "+session.getAttribute("id") +" sessionClosed");
		onlineSessions.remove(session.getAttribute("id"));
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		
		logger.info(session.getFilterChain().getSession().getRemoteAddress()+" sessionOpened");
	}

	@Override
	public void messageSent(IoSession session_A, Object message) throws Exception {
		 System.out.println("11111111");
	}
	
	 public void broadcast(String message) {
	        synchronized (onlineSessions) {
	           for (Map.Entry<Integer,IoSession> map : onlineSessions.entrySet()) {
	        	   map.getValue().write(message);
	        	   
			}
	        }
	    }
	
	
	

}
