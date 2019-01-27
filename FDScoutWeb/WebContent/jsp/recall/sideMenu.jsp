<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<h1>Recalls</h1>
<s:form id="searchForm" method="post" class="searchform" action="search" theme="simple">
	<p>
    	<s:textfield name="searchString" size="14"/>
        <input type="submit" value="Search" style="font: bold 12px Arial, Sans-serif"/>
    </p>
</s:form>
<ul class="sidemenu">
	<li><a href="start.action">Drugs</a></li>
	<li><a href="#TemplateInfo">Medical Devices</a></li>
</ul>