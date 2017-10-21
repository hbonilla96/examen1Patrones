package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends Messages{
	private String version;
	private int resul;
	private int errorMessage;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getResul() {
		return resul;
	}
	public void setResul(int resul) {
		this.resul = resul;
	}
	public int getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(int errorMessage) {
		this.errorMessage = errorMessage;
	}	
	
}
