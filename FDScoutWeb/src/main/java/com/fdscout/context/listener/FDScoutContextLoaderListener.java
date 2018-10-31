package com.fdscout.context.listener;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoaderListener;

public class FDScoutContextLoaderListener extends ContextLoaderListener 
												implements ServletContextAttributeListener//,	HttpSessionListener 
//														HttpSessionAttributeListener, 
//														HttpSessionBindingListener, 
//														ServletRequestListener, 
//														ServletRequestAttributeListener
{

	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		initialApplicationParamater(event);
		super.contextInitialized(event);
		resetUserSessions();
		initializeQueues(event);
	}


	private void resetUserSessions() {
//		((UserSessionService)WebContext.getBean("userSessionService")).deactivateAllUserSessions();
		Logger.getLogger(this.getClass()).warn("All active user sessions have been reset.");
	}
	
    private void initialApplicationParamater(ServletContextEvent event) {
    System.out.println("Starting setting Log4j parameters ...");
    	String logFileLocation = event.getServletContext().getInitParameter("log4jFileLocation");
		String applicationId = event.getServletContext().getInitParameter("applicationId");
    	String logFullPath = logFileLocation + "/" + applicationId + ".log";
    	System.setProperty("logFile", logFullPath);
//    	System.setProperty("db_user", "ps_web_user");
//    	System.setProperty("password", "password");
    	Logger.getLogger(this.getClass()).info("********************************************************************");
    	Logger.getLogger(this.getClass()).info("********************************************************************");
    	Logger.getLogger(this.getClass()).info("****************** Initializing " + applicationId + " ******************");
    	Logger.getLogger(this.getClass()).info("Log file has been initialized to " + logFullPath);
    	

		try {
			Logger.getLogger(this.getClass()).info("Application is hosted on " + InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			Logger.getLogger(this.getClass()).warn("Cannot decect the server name.");
			Logger.getLogger(this.getClass()).error(e.toString());
			e.printStackTrace();
		}
		return;
		
	}


	/**
     * @see ContextLoaderListener#ContextLoaderListener()
     */
    public FDScoutContextLoaderListener() {
        super();
        
    }


	@Override
	public void contextDestroyed(ServletContextEvent event) {
		Logger.getLogger(getClass()).warn("Presphere Servlet Context is destroyed.");
	}



	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
//		Logger.getLogger(getClass()).info("Attribute is added to Servlet Context.");
		
	}


	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
	}


	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
	}


	private void initializeQueues(ServletContextEvent event) {
//		Map<Long, PresphereQueue> benefitInvestigationQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> priorAuthQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> dataEntryQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> drugUtilizationReviewQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> consultationQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> rxDispenseQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> benefitCoordinationQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> packShipQueue = new HashMap<Long, PresphereQueue>();
//		Map<Long, PresphereQueue> exceptionQueue = new HashMap<Long, PresphereQueue>();
//		
//		List<OrganizationBean> organizationList = ((OrganizationService)WebContext.getBean("organizationService")).getOrganizationList(true);
//
//		Logger.getLogger(this.getClass()).warn("********************************************************************");		
//		for (OrganizationBean organization : organizationList) {
//			Logger.getLogger(this.getClass()).warn(organization.getOrganizationName() + "(" + organization.getBeanId() + ") has been added to " );
//			/***************/
//			benefitInvestigationQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_BENEFIT_INVESTIGATION)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_BENEFIT_INVESTIGATION);
//			/***************/
//			priorAuthQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_PRIOR_AUTH)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_PRIOR_AUTH);
//			/***************/
//			dataEntryQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_DATA_ENTRY)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_DATA_ENTRY);
//			/***************/
//			drugUtilizationReviewQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_DRUG_UTILIZATION_REVIEW)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_DRUG_UTILIZATION_REVIEW);
//			/***************/
//			consultationQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_CONSULTATION)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_CONSULTATION);
//			/***************/
//			rxDispenseQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_RX_DISPENSE)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_RX_DISPENSE);
//			/***************/
//			benefitCoordinationQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_BENEFIT_COORDINATION)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_BENEFIT_COORDINATION);
//			/***************/
//			packShipQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_PACK_SHIP)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_PACK_SHIP);
//			/***************/
//			exceptionQueue.put(organization.getBeanId(), ((PresphereQueue)WebContext.getBean(PresphereConstants.QUEUE_EXCEPTION)));
//			Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_EXCEPTION);
//			/***************/
//		}
//		Logger.getLogger(this.getClass()).warn("********************************************************************");		
//		Logger.getLogger(this.getClass()).warn("The following queues are being set to context: ");
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_BENEFIT_INVESTIGATION, benefitInvestigationQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_BENEFIT_INVESTIGATION);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_PRIOR_AUTH, priorAuthQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_PRIOR_AUTH);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_DATA_ENTRY, dataEntryQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_DATA_ENTRY);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_DRUG_UTILIZATION_REVIEW, drugUtilizationReviewQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_DRUG_UTILIZATION_REVIEW);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_CONSULTATION, consultationQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_CONSULTATION);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_RX_DISPENSE, rxDispenseQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_RX_DISPENSE);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_BENEFIT_COORDINATION, benefitCoordinationQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_BENEFIT_COORDINATION);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_PACK_SHIP, packShipQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_PACK_SHIP);
//		event.getServletContext().setAttribute(PresphereConstants.QUEUE_EXCEPTION, exceptionQueue);
//		Logger.getLogger(this.getClass()).warn("......" + PresphereConstants.QUEUE_EXCEPTION);
//		
//		
//		/********** tst code *********/
//		@SuppressWarnings("unchecked")
//		Map<Long, PresphereQueue> queueMap1 = (Map<Long, PresphereQueue>)event.getServletContext().getAttribute(PresphereConstants.QUEUE_CONSULTATION);
//		System.out.println(((PresphereQueue)queueMap1.get(new Long(1001))).getSize());
//		@SuppressWarnings("unchecked")
//		Map<Long, PresphereQueue> queueMap = (Map<Long, PresphereQueue>)event.getServletContext().getAttribute(PresphereConstants.QUEUE_BENEFIT_COORDINATION);
//		((PresphereQueue)queueMap.get(new Long(1001))).add(new PatientTask());
//		System.out.println(((PresphereQueue)queueMap1.get(new Long(1001))).getSize());
	}


}
