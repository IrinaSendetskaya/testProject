package by.htp.carparking.temp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("app-context.xml");
		CarDao dao=(CarDao) applicationContext.getBean("carDao");

		Car car=dao.read(3);
		System.out.println(car);
		
		System.out.println("----------------");
		
		dao.create(new Car(1,"Audi","xls"));
		
		
		System.out.println("----------------");
		
		List<Car> cars=dao.readAll();
		
		for (Car carList : cars) {
			System.out.println(carList);
		}
		//Car car2=new Car();
		//car2=dao.read(2);
		car.setBrand("ccccc");
		dao.update(car);
        System.out.println(car);
        
		
		System.out.println("----------------");
		
		dao.delete(car);
        System.out.println(car);
        

		System.out.println("----------------");
		
         cars=dao.readAll();
		
		for (Car carList : cars) {
			System.out.println(carList);
		}
		
		System.out.println("----------------");
		
		
//	SessionFactory factory=SessionFactoryManager.getSessionFactory();
//	
//	
//	Session session=factory.openSession();
//	
//	System.out.println(session.hashCode());
	
	}
}
