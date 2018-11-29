<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<s:iterator value="searchResult.recallDetailList">
	<jsp:include page="recall.jsp"/>
</s:iterator>