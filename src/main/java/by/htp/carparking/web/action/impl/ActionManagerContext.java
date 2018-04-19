package by.htp.carparking.web.action.impl;


import org.springframework.web.context.WebApplicationContext;

import by.htp.carparking.web.action.BaseAction;

public final class ActionManagerContext {

	private ActionManagerContext() {
		
	}	
	
	public static BaseAction getAction(String action, WebApplicationContext webApplicationContext) {
		return (BaseAction) webApplicationContext.getBean(action);
		}
	

}
