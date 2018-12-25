package com.fdscout.web.action;

import java.util.Enumeration;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.context.WebContext;
import com.fdscout.core.model.service.PortalAccessLogService;
import com.fdscout.core.util.entity.CoreMessage;
import com.fdscout.web.search.RecallDefaultResultSearchHandler;
import com.fdscout.web.search.SearchResult;

import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;

@ResultPath(value="/")
//@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class GatewayAction extends FDScoutAction {
	private static final long serialVersionUID = 8324749017672128806L;
	private PortalAccessLogService portalAccessLogService;
	private RecallDefaultResultSearchHandler recallDefaultResultSearchHandler;
	private SearchResult searchResult;
	
//	private BrowserConfigService browserConfigService;
	
	@Action(value="/start", results={@Result(name="singleRecall", type="tiles", location="searchResultSingleRecall"),
			  @Result(name="recallSummary", type="tiles", location="searchResultRecallSummary"),
			  @Result(name="noMatchFound", type="tiles", location="noMatchFound")
			 })
//    @Action(value="/start", results={@Result(name="success",  location="/jsp/test.jsp")})
	public String showGatewayPage() {
		try {
			WebContext.getServletRequest().getRemoteAddr();
//			new FoodRecallDataParser().parse("c:\\resource\\food-enforcement-0001-of-0002.json");
		}
		catch (Exception e) {
			portalAccessLogService.logPortalAccess("unknown");
			Logger.getLogger(this.getClass()).error(e);
		}
		Enumeration<String> headerNames = WebContext.getServletRequest().getHeaderNames();
		while(headerNames.hasMoreElements()) {
		  String headerName = (String)headerNames.nextElement();
		  logger.info("" + headerName + ": " + WebContext.getServletRequest().getHeader(headerName));
		}
		String userAgent = WebContext.getServletRequest().getHeader("user-agent");
		UserAgent ua = UserAgent.parseUserAgentString(userAgent);
		Version browserVersion = ua.getBrowserVersion();
		String browserName = ua.getBrowser().toString();
		int majVersion = Integer.parseInt(browserVersion.getMajorVersion());
		int minorVersion = Integer.parseInt(browserVersion.getMinorVersion());
		logger.info("Browswer: " + browserName + ", major version: " + majVersion + " minor version="+minorVersion);
		portalAccessLogService.logPortalAccess(WebContext.getServletRequest().getRemoteAddr());

		return displayHomePage();
	}

	
	public String displayHomePage() {
		searchResult = recallDefaultResultSearchHandler.executeSearch("");
//		WebContext.getSession().setAttribute(WebAttribute.SESSION_SEARCHSTRING, null);
		return searchResult.getReturnValue();
	}
	
	public void setPortalAccessLogService(PortalAccessLogService portalAccessLogService) {
		this.portalAccessLogService = portalAccessLogService;
	}
	

//	public void setBrowserConfigService(BrowserConfigService browserConfigService) {
//		this.browserConfigService = browserConfigService;
//	}

    @Action(value="/loginError", results={@Result(name="success",  type="tiles", location="portalMainTemplate")})
	public String loginError() {
		setActionErrors(new CoreMessage().addMessage("ERROR: User name or password is incorrect.  Please try again."));
		return SUCCESS;
	}


	public void setRecallDefaultResultSearchHandler(RecallDefaultResultSearchHandler recallDefaultResultSearchHandler) {
		this.recallDefaultResultSearchHandler = recallDefaultResultSearchHandler;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}

}
