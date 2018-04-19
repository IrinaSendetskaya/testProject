package by.htp.carparking.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SimpleSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		System.out.println("Session was created!!!");
		System.out.println(se.getSource());
		System.out.println(se.getSession().getId());
		System.out.println(se.getSession().getLastAccessedTime());
		se.getSession().setMaxInactiveInterval(3);   //сессия 1 минута
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSessionListener.super.sessionDestroyed(se);
		System.out.println("Session was destroyed!!!");
		System.out.println(se.getSource());
		System.out.println(se.getSession().getId());
		System.out.println(se.getSession().getLastAccessedTime());
	}

	
}
