package by.htp.carparking.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.dao.impl.CarDaoDBImpl;
import by.htp.carparking.domain.Car;



public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public MainServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		process(request,response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		process(request,response);
	}
	
	private void process (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        List<Car> cars=new ArrayList<>();
        CarDaoDBImpl carDB=new CarDaoDBImpl();

       
            //выводит список товаро только по части слова Поиска
            cars=carDB.readAll();
            req.setAttribute("cars",cars);
            
        
            
            ServletContext servletContext=getServletContext();

            //String viewJsp=command.execute(req,resp);
            RequestDispatcher dispatcher=servletContext.getRequestDispatcher(" /index.jsp");
            dispatcher.forward(req,resp);
       
            //resp.sendRedirect("do?command="+nextStep);
        

    }

}
