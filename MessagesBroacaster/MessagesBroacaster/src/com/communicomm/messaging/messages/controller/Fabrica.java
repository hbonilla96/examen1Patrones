package com.communicomm.messaging.messages.controller;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Messages;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.MessagesType;

public class Fabrica {
	
	public static Messages fabrica(MessagesType type) {
		
		switch(type) {
		case PingRequest:
			return new PingServerRequest();
		case PingResponse:
			return new PingServerResponse();
		case SignalRequest:
			return new SetWaitForSignalRequest();
		case SignalResponse:
			return new SetWaitForSignalResponse();
		case BoostrapRequest:
			return new BootstrapOperationRequest();
		case BoostrapResponse:
			return new BootstrapOperationResponse();
		}
		return null;
	}
}
