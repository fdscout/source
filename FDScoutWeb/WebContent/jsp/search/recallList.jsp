<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<s:iterator value="recallSearchResultList">
<table>
	<tr>
		<td class="body_label">Recall Number</td>
	</tr>
	<tr>
		<td class="body_text">${recall.recallNumber }</td>
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
		<td  class="body_label">Type of Recall</td>
	</tr>
	<tr>
		<td class="body_text">${recall.voluntaryOrMandated}</td>
	</tr>
	<tr>
		<td  class="body_label">Initial Notification</td>
	</tr>
	<tr>
		<td class="body_text">${recall.initialFirmNotification}</td>
	</tr>
	<tr>
		<td  class="body_label">Recall Status</td>
	</tr>
	<tr>
		<td class="body_text">${recall.status}</td>
	</tr>
	<tr>
		<td  class="body_label">Classification</td>
	</tr>
	<tr>
		<td class="body_text">${recall.classification}</td>
	</tr>
	<tr>
		<td  class="body_label">Center Classification Date</td>
	</tr>
	<tr>
		<td class="body_text">${recall.centerClassificationDate}</td>
	</tr>
	<tr>
		<td  class="body_label">Report Date</td>
	</tr>
	<tr>
		<td class="body_text">${recall.reportDate}</td>
	</tr>
	<tr>
		<td  class="body_label">Termination Date</td>
	</tr>
	<tr>
		<td class="body_text">${recall.terminationDate}</td>
	</tr>
	<tr>
		<td  class="body_label">Recall initiation Date</td>
	</tr>
	<tr>
		<td class="body_text">${recall.recallInitiationDate}</td>
	</tr>
	<tr>
		<td  class="body_label">Code Info</td>
	</tr>
	<tr>
		<td class="body_text">${recall.codeInfo}</td>
	</tr>
	<tr>
		<td  class="body_label">More Code Info</td>
	</tr>
	<tr>
		<td class="body_text">${recall.moreCodeInfo}</td>
	</tr>
	<tr>
		<td  class="body_label">Distribution Pattern</td>
	</tr>
	<tr>
		<td class="body_text">${recall.distributionPattern}</td>
	</tr>

</table>
	
	
	
</s:iterator>