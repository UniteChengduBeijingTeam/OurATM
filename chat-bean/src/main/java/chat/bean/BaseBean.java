package chat.bean;

import chat.bean.enumtype.ChatMessageEnumType;
import chat.bean.enumtype.ChatServiceResponseStatusType;

public abstract class BaseBean {

	private ChatMessageEnumType type;
	
	private ChatServiceResponseStatusType responseStatus;
	
	private String errorMessage;

	public ChatMessageEnumType getType() {
		return type;
	}

	public void setType(ChatMessageEnumType type) {
		this.type = type;
	}

	public ChatServiceResponseStatusType getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ChatServiceResponseStatusType responseStatus) {
		this.responseStatus = responseStatus;
		String msg = responseStatus.getMessage();
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
