package by.htp.carparking.service.impl;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.dao.impl.OrderDaoDBImpl;
import by.htp.carparking.service.OrderService;

public class OrderServiceImpl implements OrderService {

	//TODO add IoC
	OrderDao orderDao;
	
	
	public OrderServiceImpl() {
		super();
	}



	public OrderDao getOrderDao() {
		return orderDao;
	}



	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}



	@Override
	public void orderCar (int userId, int carId) {
		
		orderDao.insertNewOrder(userId, carId);
		
		
	}

}
