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

import com.fdscout.web.util.entity.ActionReturnValue;
import com.fdscout.web.util.entity.PresphereDialog;
import com.fdscout.web.util.entity.PresphereException;
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
    private PresphereException presphereException;
    private PresphereDialog presphereDialog;
    private PresphereDialog compactDialog;
    private PresphereDialog searchDialog;
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

	public PresphereException getPresphereException() {
		return presphereException;
	}

	public void setPresphereException(PresphereException presphereException) {
		this.presphereException = presphereException;
	}

	public PresphereDialog getPresphereDialog() {
		return presphereDialog;
	}

	public void setPresphereDialog(PresphereDialog presphereDialog) {
		this.presphereDialog = presphereDialog;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public PresphereDialog getCompactDialog() {
		return compactDialog;
	}

	public void setCompactDialog(PresphereDialog compactDialog) {
		this.compactDialog = compactDialog;
	}

	public PresphereDialog getSearchDialog() {
		return searchDialog;
	}

	public void setSearchDialog(PresphereDialog searchDialog) {
		this.searchDialog = searchDialog;
	}

	public Object getLockCarrier() {
		return null;
	}
}
