package com.fdscout.web.action;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.util.FDScoutUtility;

@SuppressWarnings("serial")
@ResultPath(value="/")
//@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class ExceptionAction extends FDScoutAction {
	private Timestamp currentTime;
	private Exception exception;
	
	@Action(value="/logJavaLangException", results={@Result(name="success", type="tiles", location="systemException")})
	public String execute() {
		currentTime = FDScoutUtility.getCurrentTimestamp();
		Logger.getLogger(this.getClass()).error(exception.getMessage());
		return SUCCESS;
	}

	public Timestamp getCurrentTime() {
		return currentTime;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}


}
