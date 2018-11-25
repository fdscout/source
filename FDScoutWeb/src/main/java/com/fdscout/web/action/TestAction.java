package com.fdscout.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.core.model.service.MetaDataService;
import com.fdscout.core.util.CoreUtility;
import com.fdscout.util.JsonImport;

@ResultPath(value="/")
@ParentPackage(value ="com.fdscout.default")
public class TestAction extends FDScoutAction {
	private MetaDataService metaDataService;
	public void setMetaDataService(MetaDataService metaDataService) {
		this.metaDataService = metaDataService;
	}

	private static final long serialVersionUID = 1L;

	@Action(value="/test", results={@Result(name="success", location="/jsp/test.jsp")})
	public String test() {
		// access core project
		System.out.println(CoreUtility.getRandomRxNumber());
		
//		new JsonImport().testParser();
		return SUCCESS;	
	}
}
