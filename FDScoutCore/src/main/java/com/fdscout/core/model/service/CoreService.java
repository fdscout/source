package com.fdscout.core.model.service;

import java.util.Observable;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.fdscout.core.model.bean.CoreBean;
import com.fdscout.core.model.dao.CoreDao;

public abstract class CoreService extends Observable{
    protected Properties coreMessageProperties;
    protected Properties coreConfigProperties;
    private CoreDao dao;
	protected Logger logger = Logger.getLogger(getClass());

    public void create (CoreBean coreBean) {
    		((CoreDao)getDao()).create(coreBean);
    }
    
	public void save(CoreBean coreBean) {
		if (coreBean.isNew()) {
			preCreateProcess(coreBean);
			getDao().create(coreBean);
			postUpdateProcess(coreBean);
		}
		else {
			preCreateProcess(coreBean);
			getDao().update(coreBean);
			postUpdateProcess(coreBean);
		}
	}
	

    public CoreDao getDao() {
        return dao;
    }

    public synchronized void setDao(CoreDao dao) {
        this.dao = dao;
    }

	public Properties getCoreMessageProperties() {
		return coreMessageProperties;
	}

	public void setCoreMessageProperties(Properties coreMessageProperties) {
		this.coreMessageProperties = coreMessageProperties;
	}

	public Properties getCoreConfigProperties() {
		return coreConfigProperties;
	}

	public void setCoreConfigProperties(Properties coreConfigProperties) {
		this.coreConfigProperties = coreConfigProperties;
	}

	protected void preCreateProcess(CoreBean coreBean) {
		return;
	}
	protected void preUpdateProcess(CoreBean coreBean) {
		return;
	}
	protected void postCreateProcess(CoreBean coreBean) {
		return;
	}
	protected void postUpdateProcess(CoreBean coreBean) {
		return;
	}
}
