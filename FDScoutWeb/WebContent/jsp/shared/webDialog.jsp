<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<sj:dialog 
	id="%{#dialog.id}" 
	autoOpen="%{#dialog.autoOpen}" 
	modal="%{#dialog.modal}" 
	title="%{#dialog.title}"
	width="%{#dialog.width}"
	height="%{#dialog.height}"
	resizable="%{#dialog.resizable}"
	closeOnEscape="%{#dialog.closeOnEscape}"
	draggable="%{#dialog.draggable}"
	hideEffect="%{#dialog.hideEffect}"	
	showEffect="%{#dialog.showEffect}"
	position="%{#dialog.position}"
	onCloseTopics="%{#dialog.onCloseTopics}"
	onOpenTopics="%{#dialog.onOpenTopics}"
	href=""
	
	closeTopics="%{#dialog.closeTopics}"
/>