/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fdscout.context.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 *
 * @author Jonathan Su
 */
public class FDScoutPreResultListener implements PreResultListener{

    @Override
    public void beforeResult(ActionInvocation invocation, String resultCode) {
//        MagnoliaAction action = (MagnoliaAction) invocation.getAction();
//        action.setPageTitle(action.getMessageProperties().getProperty("pageTitle." + action.getReturnValue()));
    }

}
