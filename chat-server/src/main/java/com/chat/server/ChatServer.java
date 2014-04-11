package com.chat.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class ChatServer {
	private static final int port = 8888;
	private static Logger logger = Logger.getLogger(ChatServer.class);

	public static void main(String[] args) {
		NioSocketAcceptor acceptor = new NioSocketAcceptor();
		DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
		IoFilter filter = new ProtocolCodecFilter(new TextLineCodecFactory());
		//chain.addLast("codec", filter);

		chain.addLast("myChin", new ProtocolCodecFilter(
				new ObjectSerializationCodecFactory()));
		acceptor.setHandler(new ChatServerHandler());
		SocketAddress localAddress = new InetSocketAddress(port);
		try {
			acceptor.bind(localAddress);
			logger.info("chat server start success");
			logger.info("telnet 127.0.0.1 " + port + "use test");
		} catch (IOException e) {
			logger.error("chat server start success error: ", e);
		}

	}

}
