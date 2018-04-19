package by.htp.carparking.service;

import java.util.List;

import by.htp.carparking.domain.Order;

public interface OrderService {
	List<Order> getOrders();
	void orderCar (int userId, int carId);
	
}
