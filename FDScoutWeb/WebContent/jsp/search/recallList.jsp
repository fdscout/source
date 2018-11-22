<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<s:iterator value="recallSearchResultList">
<table>
	<tr>
		<td class="body_label">Recall # <span style="color:black;">${recall.recallNumber}</span></td>
		<td style="text-align: right;" class="${statusStyle}">&nbsp;${recall.status}&nbsp;</td>
	</tr>
	<tr>
		<td  class="body_label">Classification</td>
	</tr>
	<tr>
		<td class="body_text" title="Classified on <s:date name="recall.centerClassificationDate" format="MM/dd/yyyy"/>">${recall.classification}</td>
	</tr>
	<tr>
		<td  class="body_label">Description</td>
	</tr>
	<tr>
		<td class="body_text">${product.description}</td>
	</tr>
	<tr>
		<td  class="body_label">Quantity</td>
	</tr>
	<tr>
		<td class="body_text">${product.quantity}</td>
	</tr>
	<tr>
		<td  class="body_label">Reason For Recall</td>
	</tr>
	<tr>
		<td class="body_text">${recall.reasonForRecall}</td>
	</tr>
	<tr>
		<td  class="body_label">Recalling Firm</td>
	</tr>
	<tr>
		<td class="body_text">${recall.recallingFirm}</td>
	</tr>
	<tr>
		<td  class="body_label">Recall initiation Date</td>
	</tr>
	<tr>
		<td class="body_text"><s:date name="recall.recallInitiationDate" format="MM/dd/yyyy"/></td>
	</tr>	<tr>
		<td  class="body_label">Report Date</td>
	</tr>
	<tr>
		<td class="body_text">
			<s:date name="recall.reportDate" format="MM/dd/yyyy"/>
			<s:if test="recall.terminationDate!=null">
				(terminated on <s:date name="recall.terminationDate" format="MM/dd/yyyy"/>)
			</s:if>
		
		</td>
	</tr>
	<tr>
		<td  class="body_label">Distribution Pattern</td>
	</tr>
	<tr>
		<td class="body_text">${recall.distributionPattern}</td>
	</tr>
<!-- 	<tr> -->
<!-- 		<td  class="body_label">Type of Recall</td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<%-- 		<td class="body_text">${recall.voluntaryOrMandated}</td> --%>
<!-- 	</tr> -->
<!-- 	<tr> -->
<!-- 		<td  class="body_label">Initial Notification</td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<%-- 		<td class="body_text">${recall.initialFirmNotification}</td> --%>
<!-- 	</tr> -->

	<tr>
		<td  class="body_label">Code Info</td>
	</tr>
	<tr>
		<td class="body_text">${recall.codeInfo}</td>
	</tr>
	<tr>
		<td class="body_text">${recall.moreCodeInfo}</td>
	</tr>

</table>
	
	
	
</s:iterator>