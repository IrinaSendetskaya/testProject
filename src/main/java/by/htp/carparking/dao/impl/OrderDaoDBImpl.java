package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.htp.carparking.connection.DBConnectionHelper;
import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.domain.Order;

public class OrderDaoDBImpl implements OrderDao {
	
	private static final Logger logger=LogManager.getLogger();
	
	
	

	public OrderDaoDBImpl() {  //для спринга пустой конструктор
		super();
	}

	@Override
	public void create(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> readAll() {
		List <Order> list=new ArrayList<>();
        try(Connection connection= DBConnectionHelper.connect();
            Statement statement=connection.createStatement()
        ) {
            String sql="SELECT * FROM Orders;";

            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next())
            {
                Order order =new Order(
                        resultSet.getInt("id"),
                        resultSet.getInt("idUser"),
                        resultSet.getInt("idCar")
                );
                list.add(order);
            }
        } catch (SQLException e) {
			e.printStackTrace();
		}

        return list;
	}

	@Override
	public void insertNewOrder(int userId, int carId) {

		Connection conn=DBConnectionHelper.connect();
	
		try (PreparedStatement ps=conn.prepareStatement(
				"INSERT INTO Orders (idUser,idCar) VALUES (?,?)" )) {
			
			ps.setInt(1, userId);
			ps.setInt(2, carId);
			
			ps.executeUpdate();
			logger.error("Error!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		
		
		
	}

	

}
