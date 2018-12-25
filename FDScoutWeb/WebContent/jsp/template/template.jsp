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
  <div id="header">
    <h1 id="logo"><span class="green">F</span>ood &amp; <span class="green">D</span>rug <span class="green">Scout</span></h1>
    <h2 id="slogan">Stay healthy, live smart</h2>
    <s:form id="searchForm" method="post" class="searchform" action="search" theme="simple">
      <p>
        <s:textfield name="searchString" class="textbox" />
        <input type="submit" class="button" value="Search" />
      </p>
    </s:form>
    <ul>
      <li id="current"><a href="start.action"><span>Home</span></a></li>
      <li><a href="recallMainPage.action"><span>Recalls</span></a></li>
      <li><a href="adverseEventMainPage.action"><span>Adverse Events</span></a></li>
      <li><a href="about.action"><span>About Us</span></a></li>
    </ul>
  </div>
  <div id="content-wrap"> <tiles:insertAttribute name="headerPhoto"/>
    <div id="sidebar" >
      <h1>Sidebar Menu</h1>
      <ul class="sidemenu">
        <li><a href="#">Home</a></li>
        <li><a href="#TemplateInfo">Template Info</a></li>
        <li><a href="#SampleTags">Sample Tags</a></li>
        <li><a href="#">More Free Templates</a></li>
        <li><a href="#">Premium Templates</a></li>
      </ul>
      <h1>Site Partners</h1>
      <ul class="sidemenu">
        <li><a href="#">Dreamhost</a></li>
        <li><a href="#">4templates</a></li>
        <li><a href="#">TemplateMonster</a></li>
        <li><a href="#">Fotolia.com</a></li>
        <li><a href="#">Text Link Ads</a></li>
      </ul>
      <div><tiles:insertAttribute name="lowerLeftBar"/></div>
    </div>
    <div id="main"> <a name="TemplateInfo"></a>
    	<tiles:insertAttribute name="contentBody"/>
   </div>
    <div id="rightbar"><tiles:insertAttribute name="rightBar"/>
    </div>
  </div>
  <div id="footer">
    <div class="footer-left">
      <p class="align-left"> &copy; 2018 <strong>Food &amp; Drug Scout </strong> | Design by <a  href="http://www.styleshout.com/" target="_blank">styleshout</a> | Valid <a href="http://validator.w3.org/check/referer">XHTML</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> </p>
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
