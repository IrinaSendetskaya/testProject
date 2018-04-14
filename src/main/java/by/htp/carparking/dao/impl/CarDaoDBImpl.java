package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import by.htp.carparking.connection.DBConnectionHelper;
import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;

public class CarDaoDBImpl implements CarDao{

	public CarDaoDBImpl() {
		super();
	}

	@Override
	public void create(Car entity) {
		
		Connection conn=DBConnectionHelper.connect();
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement("INSERT INTO Car (brand,model) VALUES (?,?)" );
			
			ps.setString(1, "brand1");
			ps.setString(2, "model1");
			
			ps.executeUpdate();
		} 
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		finally
		{
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

	@Override
	public Car read(int id) {
		return null;
	}

	@Override
	public void update(Car entity) {
		
	}

	@Override
	public void delete(Car entity) {
		
	}

	@Override
	public List<Car> readAll() {
		
		List <Car> list=new ArrayList<>();
        try(Connection connection= DBConnectionHelper.connect();
            Statement statement=connection.createStatement()
        ) {
            String sql="SELECT * FROM Car;";

            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next())
            {
                Car car =new Car(
                        resultSet.getInt("id"),
                        resultSet.getString("model"),
                        resultSet.getString("brand")
                );
                list.add(car);
            }
        } catch (SQLException e) {
			e.printStackTrace();
		}

        return list;
	}

	
}
