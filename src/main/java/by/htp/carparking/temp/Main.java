package by.htp.carparking.temp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.hbn.SessionFactoryManager;
import by.htp.carparking.domain.Car;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("app-context.xml");
		CarDao dao=(CarDao) applicationContext.getBean("carDao");

		Car car=dao.read(2);
		System.out.println(car);
		
		System.out.println("----------------");
		
		dao.create(new Car(1,"Audi","xls"));
		
		
		System.out.println("----------------");
		
		List<Car> cars=dao.readAll();
		
		for (Car carList : cars) {
			System.out.println(carList);
		}
//	SessionFactory factory=SessionFactoryManager.getSessionFactory();
//	
//	
//	Session session=factory.openSession();
//	
//	System.out.println(session.hashCode());
	
	}
}
