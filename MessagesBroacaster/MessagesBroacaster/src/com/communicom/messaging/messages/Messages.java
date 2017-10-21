package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class Messages{
	protected String messegaName;
	protected int messageNumber;
	protected String sourceAddress;
	protected String targetAddress;
	protected LocalDateTime emisionTime;
	
	public String getMessegaName() {
		return messegaName;
	}
	public void setMessegaName(String messegaName) {
		this.messegaName = messegaName;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	
	@Override
	public String toString() {
		return "Messages [Message name:" + messegaName + "\n, Message number:" + messageNumber + "\n, Source address:"
				+ sourceAddress + "\n, Target address:" + targetAddress + "\n, Emission time:" + emisionTime + "]";
	}
	
}
