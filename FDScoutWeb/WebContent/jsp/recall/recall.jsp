<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<table style="width:100%">
	<tr>
		<td style="font-weight:bold; background: #BDBDBD; padding-left: 3px; padding-top: 3px; padding-bottom: 3px;">Recall # <span style="color:black;">${recall.recallNumber}</span></td>
		<td style="text-align: right; width: 10px;" class="${statusStyle}">&nbsp;${recall.status}&nbsp;</td>
	</tr>
</table>
<table style="width:100%">	
	<tr>
		<td  class="body_label">Description</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${product.description}</td>
	</tr>
	<tr>
		<td  class="body_label" colspan="2">Quantity</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${product.quantity}</td>
	</tr>
	<tr>
		<td  class="body_label" colspan="2">Reason For Recall</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${recall.reasonForRecall}</td>
	</tr>
	<tr>
		<td  class="body_label" colspan="2">Recalling Firm</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${recall.recallingFirm}</td>
	</tr>
	<tr>
		<td  class="body_label" style="width: 50%;">Initiation Date</td>
		<td  class="body_label">Report Date</td>
	</tr>
	<tr>
		<td class="body_text"><s:date name="recall.recallInitiationDate" format="MM/dd/yyyy"/></td>
		<td class="body_text"><s:date name="recall.reportDate" format="MM/dd/yyyy"/>
		</td>
	</tr>
	<tr>
		<td  class="body_label">Classification</td>
		<td  class="body_label">Termination Date</td>
	</tr>
	<tr>
		<td class="body_text" title="Classified on <s:date name="recall.centerClassificationDate" format="MM/dd/yyyy"/>">${recall.classification}</td>
		<td class="body_text"><s:date name="recall.terminationDate" format="MM/dd/yyyy"/></td>
	</tr>
	<tr>
		<td  class="body_label" colspan="2">Distribution Pattern</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${recall.distributionPattern}</td>
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
		<td  class="body_label" colspan="2">Code Info</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${recall.codeInfo}</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${recall.moreCodeInfo}</td>
	</tr>
	<tr>
		<td  class="body_label" colspan="2">Disclaimer</td>
	</tr>
	<tr>
		<td class="body_text" colspan="2" style="font-size: 10px;color: gray;">${metaData.disclaimer}</td>
	</tr>
	
	<tr>
		<td class="body_text" colspan="2">&nbsp;</td>
	</tr>
</table>
