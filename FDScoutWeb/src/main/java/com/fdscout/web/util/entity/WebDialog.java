package com.fdscout.web.util.entity;

public class WebDialog {
	private String id;
	private boolean modal;
	private boolean autoOpen;
	private String title;
	private int width;
	private int height;
	private boolean resizable;
	private boolean closeOnEscape;
	private boolean draggable;
	private String  hideEffect;
	private String showEffect;
	private String position;
	private String onCloseTopics;
	private String onOpenTopics;
	private String closeTopics;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isModal() {
		return modal;
	}
	public void setModal(boolean modal) {
		this.modal = modal;
	}
	public boolean isAutoOpen() {
		return autoOpen;
	}
	public void setAutoOpen(boolean autoOpen) {
		this.autoOpen = autoOpen;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isResizable() {
		return resizable;
	}
	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}
	public boolean isCloseOnEscape() {
		return closeOnEscape;
	}
	public void setCloseOnEscape(boolean closeOnEscape) {
		this.closeOnEscape = closeOnEscape;
	}
	public boolean isDraggable() {
		return draggable;
	}
	public void setDraggable(boolean draggable) {
		this.draggable = draggable;
	}
	public String getHideEffect() {
		return hideEffect;
	}
	public void setHideEffect(String hideEffect) {
		this.hideEffect = hideEffect;
	}
	public String getShowEffect() {
		return showEffect;
	}
	public void setShowEffect(String showEffect) {
		this.showEffect = showEffect;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getOnCloseTopics() {
		return onCloseTopics;
	}
	public void setOnCloseTopics(String onCloseTopics) {
		this.onCloseTopics = onCloseTopics;
	}
	public String getOnOpenTopics() {
		return onOpenTopics;
	}
	public void setOnOpenTopics(String onOpenTopics) {
		this.onOpenTopics = onOpenTopics;
	}
	public String getCloseTopics() {
		return closeTopics;
	}
	public void setCloseTopics(String closeTopics) {
		this.closeTopics = closeTopics;
	}
	
}