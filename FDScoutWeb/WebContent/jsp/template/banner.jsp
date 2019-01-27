<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
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
