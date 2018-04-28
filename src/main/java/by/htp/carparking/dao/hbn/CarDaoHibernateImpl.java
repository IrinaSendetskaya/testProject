package by.htp.carparking.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;

public class CarDaoHibernateImpl implements CarDao {

	@Override
	public void create(Car entity) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		//Criteria criteria=session.createCriteria(Car.class);       //с пом маппинга выполняет круд
		Transaction transaction=session.beginTransaction();
		
		session.save(entity);
		
		transaction.commit();
		session.close();
		
	}

	@Override
	public Car read(int id) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Car.class);       //с пом маппинга выполняет круд
		criteria.add(Restrictions.eq("id", id));
		Car car=(Car) criteria.list().get(0);
		session.close();
		return car;
		
	}

	@Override
	public void update(Car entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Car entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Car> readAll() {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Car.class);       //с пом маппинга выполняет круд
		List<Car>listCar=criteria.list();
		session.close();
		return listCar;
	}

}
