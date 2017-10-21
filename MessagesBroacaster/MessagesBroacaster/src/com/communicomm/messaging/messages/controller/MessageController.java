package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;
import com.communicom.messaging.messages.Messages;
import com.communicom.messaging.messages.signals.MessagesType;

public class MessageController {
	private static ArrayList<Messages> sentMessage = new ArrayList<Messages>();
	//private ArrayList<PingServerRequest>sentPingRequest = new ArrayList<PingServerRequest>();
	//private ArrayList<PingServerResponse>receivedPingResponse = new ArrayList<PingServerResponse>();
	//private ArrayList<SetWaitForSignalRequest>sentWaitForSignalRequest = new ArrayList<SetWaitForSignalRequest>();		
	//private ArrayList<SetWaitForSignalResponse>ReceivedWaitForSignalResponse = new ArrayList<SetWaitForSignalResponse>();
	
	public void sendMessage(int messageOption) {
		if (messageOption > 4){
			System.out.println("Opción invalida");
		}else if(messageOption == 3) {
			listMessage(messageOption);
		}else{
			sentMessage.add(Fabrica.fabrica(MessagesType.values()[messageOption-1]));
		}
	}
	
	public static void listMessage(int messageOption) {
			for (Messages messages: sentMessage){
				System.out.println(messages.toString());
			}
	}
	
}
