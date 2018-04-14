package by.htp.carparking.web.action.impl;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;
import by.htp.carparking.web.action.BaseAction;

import static by.htp.carparking.web.util.WebConstantDeclaration.*;

public class CarListViewAction implements BaseAction {
	
	

	//
	private CarService carService;
	
	
	
	public CarListViewAction() {
		super();
	}



	public CarListViewAction(CarService carService) {
		super();
		this.carService = carService;
	}



	public CarService getCarService() {
		return carService;
	}



	public void setCarService(CarService carService) {
		this.carService = carService;
	}



	@Override
	public String executeAction(HttpServletRequest request) {
		
		List <Car> cars=carService.getCarsList();
		
		request.setAttribute(REQUEST_PARAM_CAR_LIST, cars);
		
		return PAGE_USER_MAIN;
	}

}
