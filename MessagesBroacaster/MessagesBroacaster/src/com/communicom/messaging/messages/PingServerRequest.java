package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends Messages{
	
	public PingServerRequest(){
		super();
		this.messageNumber = 1;
		this.emisionTime = LocalDateTime.now();
	}
	
}
