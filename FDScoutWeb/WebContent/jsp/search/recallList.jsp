<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<div style="text-align: right;">
	<s:if test="#session.searchString != null">
		<a href="loadLastSearchResult.action">[back to search results]</a>
	</s:if>
	<s:else>
		<a href="start.action">[Home]</a>
	</s:else>
	<br/><br/>
</div>
<s:iterator value="searchResult.recallDetailList">
	<jsp:include page="recall.jsp"/>
</s:iterator>