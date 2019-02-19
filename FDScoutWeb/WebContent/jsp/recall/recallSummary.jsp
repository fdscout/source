<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<br/>
<table style="width:100%">
	<tr>
		<td style="font-weight:bold; background: #BDBDBD; padding-left: 3px;padding-top: 3px; padding-bottom: 3px;"><span style="color:black;">${productShortDesc}</span></td>
		<td style="text-align: center; width: 50px;" class="${statusStyle}">&nbsp;<s:date name="recall.reportDate" format="MM/dd/yyyy"/>&nbsp;<br/>${recall.status}</td>
	</tr>
</table>
<table style="width:100%">	
	<tr>
		<td  class="body_label">Reason For Recall</td>
		<td style="text-align: right;"><a href="loadRecallDetails.action?recall.beanId=${recall.beanId}">[more details]</a></td>
	</tr>
	<tr>
		<td class="body_text" colspan="2">${recallReasonShortDesc}</td>
	</tr>
	<tr>
		<td class="body_label" colspan="2">Recall #: ${recall.recallNumber}</td>
		
	</tr>
	<tr>
		<td class="body_text" colspan="2">Initiated on <b><s:date name="recall.recallInitiationDate" format="MM/dd/yyyy"/></b> by <b>${recall.recallingFirm}</b> </td>
	</tr>	


<!-- 	<tr> -->
<!-- 		<td  class="body_label" colspan="2">Recalling Firm</td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<!-- 		<td  class="body_label" style="width: 50%;">Initiation Date</td> -->
<!-- 		<td  class="body_label">Report Date</td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<%-- 		<td class="body_text"><s:date name="recall.recallInitiationDate" format="MM/dd/yyyy"/></td> --%>
<%-- 		<td class="body_text"><s:date name="recall.reportDate" format="MM/dd/yyyy"/> --%>
<!-- 		</td> -->
<!-- 	</tr> -->
</table>
