package com.presphere.core.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CoreContext implements ApplicationContextAware, BeanFactoryAware {
    private static ApplicationContext CONTEXT;
    private static BeanFactory beanFactory;
    
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        CONTEXT = context;
    }

    public static Object getBean(String beanName) {
        if(beanName == null || beanName.trim().length() == 0){
            return null;
        }
        return (CONTEXT != null) ? CONTEXT.getBean(beanName) : null;
    }

    public static Object getBean(String beanName, String defaultBeanName) {
      return beanFactory.containsBean(beanName) ? getBean(beanName) : getBean(defaultBeanName);        
    }

    public static ApplicationContext getSpringContext() {
    	return CONTEXT;
    }
    
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
	}
}
    
