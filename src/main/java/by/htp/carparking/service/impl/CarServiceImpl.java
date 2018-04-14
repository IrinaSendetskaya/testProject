package by.htp.carparking.service.impl;

import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

public class CarServiceImpl implements CarService{
	
	//TODO change to IoC, singletone
	private CarDao carDao;
	
	
	
	public CarServiceImpl() {
		super();
	}

	public CarServiceImpl(CarDao carDao) {
		super();
		this.carDao = carDao;
	}

	public CarDao getCarDao() {
		return carDao;
	}

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public List<Car> getCarsList() {
		
		return carDao.readAll();
	}

}
