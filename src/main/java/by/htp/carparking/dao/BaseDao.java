package by.htp.carparking.dao;

import java.util.List;

import by.htp.carparking.domain.EntityCarparking;

public interface BaseDao <T>{

	void create(T entity);
	T read (int id);
	void update (T entity);
	void delete (T entity);
	
	List <T>readAll();
	
}
