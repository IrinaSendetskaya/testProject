package by.htp.carparking.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import by.htp.carparking.web.action.BaseAction;
import by.htp.carparking.web.action.impl.ActionManagerContext;

import static by.htp.carparking.web.util.WebConstantDeclaration.*;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SecondServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		process(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	private void process (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext servletContext=req.getServletContext();
		WebApplicationContext webApplicationContext=WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		String action=req.getParameter(REQUEST_PARAM_ACTION);
		BaseAction baseAction=ActionManagerContext.getAction(action,webApplicationContext);
		
		if(action!=null)
		{
		String page=baseAction.executeAction(req);
		
        RequestDispatcher dispatcher=req.getRequestDispatcher(page);
        dispatcher.forward(req,resp);
		}
		else
		{
			resp.getWriter().println("Incorrect Action!");
		}

	}
}
