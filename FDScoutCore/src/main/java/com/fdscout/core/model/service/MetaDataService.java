package com.fdscout.core.model.service;

public class MetaDataService extends CoreService {
	public void test() {
		System.out.println("from metaDataService");
		
	}
//	public void saveBrowserConfig(BrowserConfigBean browserConfig) {
//		browserConfig.setCreateTime(CoreUtility.getCurrentTimestamp());
//		((BrowserConfigDao)getDao()).create(browserConfig, true);
//	}
//	
//	public List<BrowserConfigBean> getAllowedBrowserList() {
//		return ((BrowserConfigDao) getDao()).getBrowserConfigList();
//	}
//	
//	public boolean isThisASupportedBrowserVersion(UserAgent userAgent) {
//		if(userAgent == null) {
//			return false;
//		}
//		
//		List<BrowserConfigBean> allowedBrowsers = getAllowedBrowserList();
//		if(allowedBrowsers == null || allowedBrowsers.isEmpty()) {
//			return true;
//		}
//		
//		String name = userAgent.getBrowser().getName();
//		String version = userAgent.getBrowserVersion().getMajorVersion()+"."+userAgent.getBrowserVersion().getMinorVersion();
//		boolean match = false;
//		for(BrowserConfigBean allowedBrowser : allowedBrowsers) {
//			logger.debug("Browser name from DB:"+allowedBrowser.getName()+" from user="+name);
//			if(name.toLowerCase().contains(allowedBrowser.getName())) {
//				logger.debug("version from DB min:"+allowedBrowser.getMinVersion()+" max="+allowedBrowser.getMaxVersion()+" user version="+version);
//				match = true;
//				if(StringUtils.isNotBlank(allowedBrowser.getMinVersion())) {
//					if(!Version.compare(version).ge(allowedBrowser.getMinVersion())) {
//						logger.info("Browser min version not matched.");
//						match = false;
//					}
//				}
//				
//				if(match && StringUtils.isNotBlank(allowedBrowser.getMaxVersion())) {
//					if(!Version.compare(version).le(allowedBrowser.getMaxVersion())) {
//						logger.info("Browser max version match failed.");
//						match = false;
//					}
//				}
//				break;
//			}
//		}
//		
//		return match;
//	}
}
