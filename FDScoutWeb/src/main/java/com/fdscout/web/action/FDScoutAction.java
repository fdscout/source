package com.fdscout.web.action;

import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.ServletContextAware;

import com.fdscout.core.util.entity.CoreException;
import com.fdscout.web.util.entity.ActionReturnValue;
import com.fdscout.web.util.entity.WebDialog;
import com.opensymphony.xwork2.ActionSupport;

public class FDScoutAction extends ActionSupport 
							 implements ServletRequestAware, 
							 			ServletContextAware,
							 			ServletResponseAware,
							 			SessionAware,
							 			ActionReturnValue	
							 			 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1066303025799788064L;

    private ServletContext servletContext;
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private Map<String, String[]> parameters;
    private String returnValue;
    private String pageTitle;
    private Properties messageProperties;
    private boolean skipPreResultListener;
    private CoreException presphereException;
    private WebDialog webDialog;
    private WebDialog compactDialog;
    private WebDialog searchDialog;
    private String text;
	protected Logger logger = Logger.getLogger(getClass());

    public void validate() {
    }
    
    public void setSession(Map<String, Object> session) {
    }

//    protected void setActionMessage(Alert alert) {
//		setActionErrors(alert.getErrors().getMessageText());
//		setActionMessages(alert.getWarnings().getMessageText());
//    }
    
    public boolean isActionHasErrors() {
    	return hasActionErrors();
    }
    
    public boolean isSkipPreResultListener() {
        return skipPreResultListener;
    }

    public void setSkipPreResultListener(boolean skipPreResultListener) {
        this.skipPreResultListener = skipPreResultListener;
    }


    public Properties getMessageProperties() {
        return messageProperties;
    }

    public void setMessageProperties(Properties messageProperties) {
        this.messageProperties = messageProperties;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }


    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }


	public ServletContext getServletContext() {
		return servletContext;
	}

    @Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

    @Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}

	public Map<String, String[]> getParameters() {
		return parameters;
	}

	public String getRequestParameter(String key) {
		if (parameters != null && parameters.get(key) != null) {
			return parameters.get(key)[0];
		}
		return "";
	}

	public String getRequestParameter(String key, int index) {
		if (parameters != null && parameters.get(key) != null) {
			String[] paramList = parameters.get(key);
			if (index >= 0 && index < paramList.length) {
				return parameters.get(key)[0];
			}
		}
		return "";
	}

	public String getContextParameter(String paramName) {
		try {
			if (servletContext.getInitParameter(paramName) == null) {
				return "";
			}
		}
		catch (Exception e) {
			return "";
		}
		return servletContext.getInitParameter(paramName);
	}

	@Override
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
		
	}

	public CoreException getPresphereException() {
		return presphereException;
	}

	public void setPresphereException(CoreException presphereException) {
		this.presphereException = presphereException;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public WebDialog getCompactDialog() {
		return compactDialog;
	}

	public void setCompactDialog(WebDialog compactDialog) {
		this.compactDialog = compactDialog;
	}

	public WebDialog getSearchDialog() {
		return searchDialog;
	}

	public void setSearchDialog(WebDialog searchDialog) {
		this.searchDialog = searchDialog;
	}

	public Object getLockCarrier() {
		return null;
	}

	public WebDialog getWebDialog() {
		return webDialog;
	}

	public void setWebDialog(WebDialog webDialog) {
		this.webDialog = webDialog;
	}
}
