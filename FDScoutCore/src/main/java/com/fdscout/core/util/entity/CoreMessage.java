package com.fdscout.core.util.entity;

import java.util.ArrayList;
import java.util.List;

public class CoreMessage {
	private List <String> messageList;
	private int typeId;
	private int priorityId;

	public List <String> addMessage(String text) {
		if (messageList == null) {
			messageList = new ArrayList<String>();
		}
		messageList.add(text);
		return messageList;
	}
	
	public boolean isEmpty() {
		return messageList == null || messageList.size() == 0;
	}
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public List<String> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<String> messageList) {
		this.messageList = messageList;
	}

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}
	
}