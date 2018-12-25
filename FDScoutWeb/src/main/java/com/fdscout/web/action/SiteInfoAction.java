package com.fdscout.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@SuppressWarnings("serial")
@ResultPath(value="/")
@ParentPackage(value ="com.fdscout.default")
public class SiteInfoAction extends FDScoutAction {

	@Action(value="/about", results={@Result(name="success", type="tiles", location="about")})
	public String about() {
		return SUCCESS;	
	}
}
