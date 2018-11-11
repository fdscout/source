package com.fdscout.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.core.util.CoreUtility;

@ResultPath(value="/")
@ParentPackage(value ="com.fdscout.default")
public class Test2Action extends FDScoutAction {
//	private MetaDataService metaDataService;
//	public void setMetaDataService(MetaDataService metaDataService) {
//		this.metaDataService = metaDataService;
//	}

	private static final long serialVersionUID = 1L;

	@Action(value="/test2", results={@Result(name="success", type="tiles", location="testTemplate")})
	public String test() {
		// access core project
		System.out.println(CoreUtility.getRandomRxNumber());
		return SUCCESS;	
	}
}
