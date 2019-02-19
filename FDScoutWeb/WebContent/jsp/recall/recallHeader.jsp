<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<table>
	<tr>
		<td><h1>Recalls</h1></td>
		<td>
			<s:form id="searchRecallForm" method="post" class="searchform" action="searchRecall" theme="simple">
				<p>
			    	<s:textfield name="searchString" size="14"/>
			        <input type="submit" value="Search" style="font: bold 12px Arial, Sans-serif"/>
			    </p>
			</s:form>
		</td>
	</tr>
</table>

