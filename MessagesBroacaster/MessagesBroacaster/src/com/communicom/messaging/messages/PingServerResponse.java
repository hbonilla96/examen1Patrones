package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends Messages{
	
	public PingServerResponse(){
		super();
		this.messageNumber = 2;
		this.emisionTime = LocalDateTime.now();
	}
	
}
