package com.fdscout.web.action;

import java.util.Enumeration;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.context.WebContext;
import com.fdscout.core.model.service.BrowserConfigService;
import com.fdscout.core.model.service.PortalAccessLogService;
import com.fdscout.core.util.entity.CoreMessage;
import com.fdscout.core.util.parser.FoodRecallRecordParser;

import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;

@ResultPath(value="/")
//@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class GatewayAction extends FDScoutAction {
	private static final long serialVersionUID = 8324749017672128806L;
	private PortalAccessLogService portalAccessLogService;
	private BrowserConfigService browserConfigService;
	
    @Action(value="/start", results={@Result(name="success", type="tiles", location="masterTemplate")})
//    @Action(value="/start", results={@Result(name="success",  location="/jsp/test.jsp")})
	public String showGatewayPage() {
		try {
			WebContext.getServletRequest().getRemoteAddr();
			new FoodRecallRecordParser().testParser();
		}
		catch (Exception e) {
			portalAccessLogService.logPortalAccess("unknown");
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
		//check for browser compatibility.
//		if(!browserConfigService.isThisASupportedBrowserVersion(ua)) {
//			logger.info("Browswer Version Not supported : " + browserName + ", major version: " + majVersion + " minor version="+minorVersion);
//			return "browserError";
//		} else {
//			logger.info("Browser version supported...");
//		}

		return SUCCESS;
	}

	public void setPortalAccessLogService(PortalAccessLogService portalAccessLogService) {
		this.portalAccessLogService = portalAccessLogService;
	}
	

	public void setBrowserConfigService(BrowserConfigService browserConfigService) {
		this.browserConfigService = browserConfigService;
	}

    @Action(value="/loginError", results={@Result(name="success",  type="tiles", location="portalMainTemplate")})
	public String loginError() {
		setActionErrors(new CoreMessage().addMessage("ERROR: User name or password is incorrect.  Please try again."));
		return SUCCESS;
	}

}
