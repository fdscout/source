<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<head>
<title>Food &amp; Drug Scout</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="style/style.css" type="text/css" />
<link rel="stylesheet" href="style/BrightSide.css" type="text/css" />
</head>
<body>
<div id="wrap">
	<jsp:include page="banner.jsp"/>
  	<div id="content-wrap"> <tiles:insertAttribute name="headerPhoto"/>
    <div id="sidebar" >
		<tiles:insertAttribute name="sideMenu"/>
      	<div><tiles:insertAttribute name="lowerLeftBar"/></div>
    </div>
    <div id="main"> <a name="TemplateInfo"></a>
    	<tiles:insertAttribute name="contentBody"/>
   </div>
<%--     <div id="rightbar"><tiles:insertAttribute name="rightBar"/> --%>
<!--     </div> -->
  </div>
  <div id="footer">
    <div class="footer-left">
      <p class="align-left"> &copy; 2018 <strong>Food &amp; Drug Scout </strong> </p>
    </div>
    <div class="footer-right">
      <p class="align-right"> <a href="#">Home</a>&nbsp;|&nbsp; <a href="#">SiteMap</a>&nbsp;|&nbsp; <a href="#">RSS Feed</a> </p>
    </div>
  </div>
</div>
	<s:set var="dialog" value="webDialog"/>
	<jsp:include page="/jsp/shared/webDialog.jsp"/>
	<s:set var="dialog" value="compactDialog"/>
	<jsp:include page="/jsp/shared/webDialog.jsp"/>	
	<s:set var="dialog" value="searchDialog"/>
	<jsp:include page="/jsp/shared/webDialog.jsp"/>	
</body>
</html>
